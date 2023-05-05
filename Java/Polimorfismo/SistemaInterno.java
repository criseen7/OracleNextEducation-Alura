
public class SistemaInterno {
	
	private String clave = "Alura";
	
	public boolean autenticar(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error login");
			return false;
		}
	}
}
