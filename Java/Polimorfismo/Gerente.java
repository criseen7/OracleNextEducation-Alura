//package Polimorfismo;

public class Gerente extends Funcionario implements Autenticable {//herencia
    
    public double getBonificacion(){//sobreescritura del metodo
        return 2000;//super.getSalario() + this.getSalario()*0.05;//accede a metodos (super) y constructores (super()) de la super clase (madre)
    }

	@Override
	public boolean iniciarSesion(String clave) {
		
		return false;
	}

	@Override
	public void setClave(String Clave) {
		
		
	}
}
