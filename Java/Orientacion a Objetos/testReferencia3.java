
public class testReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaCris = new Cuenta();
		Cliente cliente = new Cliente();
		/*cuentaCris.titular = cliente;
		cuentaCris.titular = new Cliente();//Sobrescribe cliente;*/
		cuentaCris.setTitular(cliente);
		cuentaCris.getTitular().setNombre("Cristofer");
		System.out.println(cuentaCris.getTitular().getNombre());
	}
}
