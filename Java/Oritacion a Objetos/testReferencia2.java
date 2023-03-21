
public class testReferencia2 {
	public static void main(String[] args) {
		Cliente cris = new Cliente();
		cris.setNombre("Cristofer");
		cris.setDocumento("hdf4215");
		cris.setTelefono("9511098054");
		
		Cuenta cuentaCris = new Cuenta();
		cuentaCris.setAgencia(1);
		cuentaCris.setTitular(cris);
		System.out.println(cuentaCris.getTitular().getDocumento());
		System.out.println(cuentaCris.getTitular());
		System.out.println(cris);
	}
}
