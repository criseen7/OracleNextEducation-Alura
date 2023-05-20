//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new LinkedList<>();//Interface List

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    public Curso(String nombre, int tiempo, List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList);
    }
    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public void addAula(Aula aula){
        this.aulaList.add(aula);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
   
}
