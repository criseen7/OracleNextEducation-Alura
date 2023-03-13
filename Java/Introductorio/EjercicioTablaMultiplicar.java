public class EjercicioTablaMultiplicar{
    public static void main(String[] args) {
        int resultado;
        for(int contador=0;contador<=10;contador++){
            for(int multiplicacion=0;multiplicacion<=10;multiplicacion++){
                resultado=contador*multiplicacion;
                System.out.println(contador+" * "+multiplicacion+" = "+resultado);
            }
            System.out.println('\n');
        }       
    }
}