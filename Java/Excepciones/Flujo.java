public class Flujo{

    public static void main(String [] args){
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin main");
    }
    
    private static void metodo1(){
        System.out.println("Inicio metodo1");
        try{
            metodo2();
        }catch(MiException me){
            me.printStackTrace();
        }
        System.out.println("Fin metodo1");
    }

    private static void metodo2(){
        System.out.println("Inicio metodo2");
        //for(int i=1; i<=5; i++){
            /*try{//intenta esto
                if(i==3){
                    int num=0;
                    int resultado =1/num;
                    System.out.println(resultado);
                }
                String test = null;
                System.out.println(test.toString());
            }catch(ArithmeticException | NullPointerException exception){//atrapa el error
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }//try no puede existir sin catch*/
           // System.out.println(i);
       // }
        /*ArithmeticException ae = new ArithmeticException();//creando mi propia excepcion
        throw ae;//lanza la exception pero no deja compilar nada debajo de la instruccion
        //System.out.println("Fin metodo2");*/
        throw new MiException("Mi excepcion fue lanzada");
        
    }

}