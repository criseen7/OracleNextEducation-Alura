
public class pruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaCris = new Cuenta();
		cuentaCris.saldo = 300;
		System.out.println(cuentaCris.saldo);
		
		cuentaCris.depositar(200);
		System.out.println(cuentaCris.saldo);
		boolean retiro=cuentaCris.retirar(100);
		System.out.println(retiro);
		System.out.println(cuentaCris.saldo);
		
		Cuenta cuentaChanchito = new Cuenta();
		cuentaChanchito.depositar(1000);
		boolean transferencia = cuentaChanchito.transferir(400, cuentaCris);
		System.out.println(transferencia);
		System.out.println(cuentaCris.saldo);
		System.out.println(cuentaChanchito.saldo);
	}
}
