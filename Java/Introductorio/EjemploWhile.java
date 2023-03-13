public class EjemploWhile {
    public static void main(String[] args) {
            int contador = 0;
            while(contador<=10){
                System.out.println(contador);
                contador++;
            }
            int contador2=0,suma=0;
            while(contador2<=10){
                suma=suma+contador2;
                contador2++;
            }
            System.out.println(suma);
    }
}
