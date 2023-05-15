import java.util.ArrayList;

public class Clase4 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 30);
        Curso curso2 = new Curso("Fisica", 10);
        Curso curso3 = new Curso("Quimica", 20);
        Curso curso4 = new Curso("Historia", 50);

        ArrayList <Curso> lista = new ArrayList<>();
        lista.add(curso1);
        lista.add(curso2);
        lista.add(curso3);
        lista.add(curso4);

        System.out.println(lista);
    }
}
