import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clase13 {
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Jose Jose";
        String alumno3 = "Michael Jackson";
        String alumno4 = "Juan Gabriel";
        String alumno5 = "Fredy Mercury";
        String alumno6 = "Maria Leon";
        String alumno7 = "Fredy Mercury";
        String alumno8 = "Maria Leon";

        Set<String> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);
        
        /*listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });*/

        boolean valida = listaAlumnos.contains("Jose Jose");
        System.out.println(valida);
        
        String max = listaAlumnos.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(max.length());

        listaAlumnos.removeIf(alumno -> "Michael Jackson".equalsIgnoreCase(alumno));
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
    }
}