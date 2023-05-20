import java.util.HashSet;
import java.util.Set;

public class Clase14 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Jose Jose", "002");
        Alumno alumno3 = new Alumno("Michael Jackson", "003");
        Alumno alumno4 = new Alumno("Juan Gabriel", "004");
        Alumno alumno5 = new Alumno("Fredy Mercury", "005");
        Alumno alumno6 = new Alumno("Maria Leon", "006");
        Alumno alumno7 = new Alumno("Julieta Venegas", "007");

        Set<Alumno> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

        Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");
        
        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));
    }
}