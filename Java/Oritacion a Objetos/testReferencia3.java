
public class testReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaCris = new Cuenta();
		/*Cliente cliente = new Cliente();
		cuentaCris.titular = cliente;
		cuentaCris.titular = new Cliente();//Sobrescribe cliente;*/
		cuentaCris.titular.nombre = "Cristofer";
		System.out.println(cuentaCris.titular.nombre);
	}
}
