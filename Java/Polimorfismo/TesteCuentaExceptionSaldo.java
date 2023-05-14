
public class TesteCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123);
        cuenta.depositar(200);
        cuenta.retirar(200);
        cuenta.retirar(100);
    }
}
