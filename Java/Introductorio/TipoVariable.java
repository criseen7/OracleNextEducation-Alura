public class TipoVariable{
    public static void main(String[] args){
        int edad = 28;
        System.out.println(edad);
        edad=47+13;
        System.out.println("La edad es: " + edad);
        double salario = 1250.56;
        System.out.println(salario);
        double salarioMitad=salario/2;
        System.out.println(salarioMitad);
        double variable1 = 230.89;
        int variable1Entero = (int) variable1; //cast
        System.out.println(variable1Entero);
        long prueba = 1222222222222222222L;//64bits la L es necesaria
        System.out.println(prueba);
        short numPeque = 13555;//16 bits
        System.out.println(numPeque);
        byte numMasPeque = 15;//8 bits
        System.out.println(numMasPeque);
        float decimalPeque = 2.5F;//F obligatoria
        System.out.print(decimalPeque);
    }
}