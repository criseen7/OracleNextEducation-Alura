public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        try{
            con.leerDatos();
        }catch(IllegalStateException ex){
            System.out.println("Recibiendo excepcion");
            ex.printStackTrace();
        }finally{// Si es exitoso o erroneo se ejecuta
            con.cerrar();
        }
    }
}
