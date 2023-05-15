import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        Curso curso2 = new Curso("PHP", 10);
        Curso curso3 = new Curso("Javscript", 20);
        Curso curso4 = new Curso("Ruby", 50);

        ArrayList <Curso> lista = new ArrayList<>();
        lista.add(curso1);
        lista.add(curso2);
        lista.add(curso3);
        lista.add(curso4);

        System.out.println(lista); 

        /*Collections.sort(lista);
        System.out.println(lista);
        Collections.sort(lista,Collections.reverseOrder());
        System.out.println(lista);*/

        //No tilizan implents ni comapre to
        /*lista.sort(Comparator.comparing(Curso::getNombre));
        System.out.println(lista);
        Collections.sort(lista,Comparator.comparing(Curso::getNombre).reversed());
        System.out.println(lista);*/
        List<Curso> cursos = lista.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursos);//Ordeno por tiempo


    }
}
