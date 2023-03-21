//Entidad cuenta:
class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
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
    public double getSaldo() {//getter
    	return saldo;
    }
    public void setAgencia(int agencia) {//setter
    	if(agencia>0)
    			this.agencia=agencia;
    }
    public int getAgencia() {
		return agencia;
	}
    public void setNumero(int numero) {
    	if(agencia>0)
    		this.numero = numero;
	}
    public int getNumero() {
		return numero;
	}
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    public Cliente getTitular() {
		return titular;
	}
}
