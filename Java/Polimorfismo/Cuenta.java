//Entidad cuenta:
//package Polimorfismo;
public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    private static int total=0; //dato static
    
    public Cuenta(int agencia) {//constructor
    	
    	if(agencia<=0)
    		this.agencia = 1;
    	else
    		this.agencia=agencia;
    	total++;
    	System.out.println("Se van creando: "+total+" cuentas");
    }
    
    public abstract void depositar(double dinero);
    public boolean retirar(double dinero) {
    	if(dinero<=this.saldo) {
    		this.saldo-=dinero;
    		return true;
    	}
    	return false;
    }
    public boolean transferir(double dinero,Cuenta cuenta) {
    	if(this.saldo>=dinero) {
    		this.retirar(dinero);
    		cuenta.depositar(dinero);
    		return true;
    	}
    	return false;
    }
    public double getSaldo() {//getter
    	return saldo;
    }
    public void setAgencia(int agencia) {
		this.agencia = agencia;
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
