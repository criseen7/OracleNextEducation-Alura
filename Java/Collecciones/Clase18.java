
public class Clase18 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia", 30);

        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Jose Jose", "002");
        Alumno alumno3 = new Alumno("Michael Jackson", "003");
        Alumno alumno4 = new Alumno("Juan Gabriel", "004");
        Alumno alumno5 = new Alumno("Fredy Mercury", "005");
        Alumno alumno6 = new Alumno("Maria Leon", "006");
        Alumno alumno7 = new Alumno("Julieta Venegas", "007");

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        Alumno alumnoMap = curso1.getAlumnoMap().get("003");
        System.out.println(alumnoMap);

        curso1.getAlumnoMap().forEach((codigo, alumno) ->{
            System.out.println(alumno);
        });
    
    }
}