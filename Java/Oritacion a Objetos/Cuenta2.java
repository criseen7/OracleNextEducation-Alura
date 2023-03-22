//Entidad cuenta 2:
class Cuenta2 {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    private static int total=0; //dato static
    
    public Cuenta2(int agencia) {//constructor
    	
    	if(agencia<=0)
    		this.agencia = 1;
    	else
    		this.agencia=agencia;
    	total++;
    	System.out.println("Se van creando: "+total+" cuentas");
    }
    
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
    public static int getTotal() {//Metodo static -> miembro estatico
		return total;//al no ser un atributo, no puedo usar this
	}
}