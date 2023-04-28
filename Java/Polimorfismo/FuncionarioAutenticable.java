
public class FuncionarioAutenticable extends Funcionario {

	private String clave;

    public void setClave(String Clave){
        this.clave=Clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == "Alura";
    }
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
