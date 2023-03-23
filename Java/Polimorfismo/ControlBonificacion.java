package Polimorfismo;

class controlBonificacion {
    private double suma;

    public double registrarSalario(Funcionario funcionario){//Funcionara solo si son hijos de la clase mas generica(Funcionario)
        this.suma += funcionario.getBonificacion();
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
    /*public double registrarSalario(Gerente gerente){//sobrecarga
        this.suma += gerente.getBonificacion();
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
    public double registrarSalario(Contador contador){//sobrecarga
        this.suma += contador.getBonificacion();
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }*/
}
