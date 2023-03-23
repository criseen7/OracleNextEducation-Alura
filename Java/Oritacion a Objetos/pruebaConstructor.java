
public class pruebaConstructor {
	public static void main(String[] args) {
		Cuenta2 cuenta = new Cuenta2(555);
		Cuenta2 cuenta2 = new Cuenta2(333);
		Cuenta2 cuenta3 = new Cuenta2(444);
		System.out.println(cuenta.getAgencia());
		System.out.println(cuenta2.getAgencia());
		System.out.println(cuenta3.getAgencia());

		System.out.println(Cuenta2.getTotal());//Solo porque es estatico
		
	}
}
