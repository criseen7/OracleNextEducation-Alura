//package Polimorfismo;

public class testFuncionario {
    public static void main(String[] args) {
        Funcionario cris = new Contador();
        cris.setNombre("Cristofer");
        cris.setDocumento("56665");
        cris.setSalario(2000);
        cris.setTipo(0);

        System.out.println(cris.getSalario());
        System.out.println(cris.getBonificacion());
    }
}
