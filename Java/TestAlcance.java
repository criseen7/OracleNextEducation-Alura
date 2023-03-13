public class TestAlcance {

    public static void main (String [] args) {
        System.out.println ("pruebas condicionales");
        int edad = 20;
        int cantidadPersonas = 3;
        boolean acompanado;
        if (cantidadPersonas >= 2) {
            acompanado = true;
        } else {
            acompanado = false;
        }
        if (edad >= 18 || acompanado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
    }
}