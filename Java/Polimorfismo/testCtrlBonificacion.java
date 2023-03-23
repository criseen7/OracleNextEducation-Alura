package Polimorfismo;

public class testCtrlBonificacion{
    public static void main(String[] args) {
        Funcionario cris = new Funcionario();
        cris.setSalario(2000);
        Gerente xime = new Gerente();
        xime.setSalario(10000);
        Contador ale = new Contador();
        ale.setSalario(5000);
        controlBonificacion controlBonificacion = new controlBonificacion();
        controlBonificacion.registrarSalario(cris);
        controlBonificacion.registrarSalario(xime);//Llama siempre mas al metodo mas especifico
        controlBonificacion.registrarSalario(ale);//Llama siempre mas al metodo mas especifico
    }
}