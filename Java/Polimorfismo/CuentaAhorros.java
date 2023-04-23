
public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia) {
		super(agencia);
	}

	@Override
	public void depositar(double dinero) {
		this.saldo=this.saldo+dinero;
		
	}

}
