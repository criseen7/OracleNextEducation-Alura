package Polimorfismo;

public class Gerente extends Funcionario {//herencia
    private String clave;

    public void setClave(String Clave){
        this.clave=Clave;
    }
    public boolean iniciarSesion(){
        return this.clave == "Alura";
    }
}
