import java.util.ArrayList;

class Clase2 {
    public static void main(String[] args) {
        String variable1 = "clase 1";
        String variable2 = "clase 2";
        String variable3 = "clase 3";
        String variable4 = "clase 4";

        ArrayList <String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        /*for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }*/
        /*for(String clase : lista){
            System.out.println(clase);
        }*/
        lista.forEach(clase ->{
            System.out.println(clase);
        });

    }
}
