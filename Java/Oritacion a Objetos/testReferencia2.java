
public class testReferencia2 {
	public static void main(String[] args) {
		Cliente cris = new Cliente();
		cris.nombre = "Cristofer";
		cris.documento = "45444332";
		cris.telefono = "9511098054";
		
		Cuenta cuentaCris = new Cuenta();
		cuentaCris.agencia=1;
		cuentaCris.titular=cris;
		System.out.println(cuentaCris.titular.documento);
		System.out.println(cuentaCris.titular);
		System.out.println(cris);
	}
}
