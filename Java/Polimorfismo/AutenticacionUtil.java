
public class AutenticacionUtil {

		private String clave;
		
		
		public boolean iniciarSesion(String Clave) {
			return this.clave == Clave;
		}
	
		public void setClave(String Clave) {
			this.clave = Clave;
		}

}
