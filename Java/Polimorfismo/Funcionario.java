package Polimorfismo;

public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    public Funcionario() {
        
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public double getSalario() {
        return salario;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public double getBonificacion(){
        return this.salario*0.05;
    }

}
