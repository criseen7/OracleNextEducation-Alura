package Polimorfismo;

public class testReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();//Polimorfismo
        funcionario.setNombre("Cristofer");
        Gerente gerente = new Gerente();
        gerente.setNombre("Ximena");
        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        //funcionario.iniciarSesion();// -> no funciona debido apesar de ser un nuevo gerente, tiene la referencia a la clase Funcion
        System.out.println(gerente.iniciarSesion());
    }
}
