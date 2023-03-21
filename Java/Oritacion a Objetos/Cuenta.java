//Entidad cuenta:
class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();
    
    void depositar(double dinero){
    	this.saldo=this.saldo+dinero;
    }
    public boolean retirar(double dinero) {
    	if(dinero<=this.saldo) {
    		this.saldo-=dinero;
    		return true;
    	}
    	return false;
    }
    public boolean transferir(double dinero,Cuenta cuenta) {
    	if(this.saldo>=dinero) {
    		this.saldo-=dinero;
    		cuenta.depositar(dinero);
    		return true;
    	}
    	return false;
    }
}
