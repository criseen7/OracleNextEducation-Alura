import java.util.HashSet;
import java.util.Set;

public class Clase12 {
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
        //SET no acepta duplicados
        for(String alumno: listaAlumnos){
            System.out.println(alumno);
        }//set no tiene orden o posicion especifica -> no hay get()
        
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
        
    }

}
