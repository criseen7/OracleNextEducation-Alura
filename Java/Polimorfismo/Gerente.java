package Polimorfismo;

public class Gerente extends Funcionario {//herencia
    private String clave;

    public void setClave(String Clave){
        this.clave=Clave;
    }
    public boolean iniciarSesion(){
        return this.clave == "Alura";
    }
    public double getBonificacion(){//sobreescritura del metodo
        return super.getSalario() + super.getBonificacion();//accede a metodos (super) y constructores (super()) de la super clase (madre)
    }
}
