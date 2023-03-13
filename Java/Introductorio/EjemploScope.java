public class EjemploScope {
    public static void main(String[] args) {
        int edad =21;
        int cantidadPersonas=2;
        boolean esPareja;
        if(cantidadPersonas > 1){
            esPareja=true;
        }else{
            esPareja=false;
        }
        boolean puedeEntrar = edad >=18 && esPareja;
        System.out.println("El valor de la condicion es: "+esPareja);
        if(puedeEntrar)
            System.out.println("Sea bienvenido");
        else
            System.out.println("No puedes pasar, eres menor de edad y no traes pareja");
    }
}
