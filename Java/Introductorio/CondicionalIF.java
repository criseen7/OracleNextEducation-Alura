public class CondicionalIF {
    public static void main(String[] args) {
        int edad =2;
        int cantidad=2;
        if(edad >=18)
            System.out.println("Eres mayor de edad, puedes pasar");
        else{
            if(cantidad>=2)
                System.out.println("Usted es menor de edad "+"Puedes pasar");
            else
            System.out.println("No puedes pasar, eres menor de edad");
        }
    }
}
