
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia) {
		super(agencia);
	}
	@Override//sobreescribe el metodo de la clase padre
	public boolean retirar(double dinero) {
		double comision = 0.2;
		return super.retirar(dinero + comision);
	}
	@Override
	public void depositar(double dinero) {
		this.saldo=this.saldo+dinero;
	}
}
