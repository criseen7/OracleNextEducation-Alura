public class TestConexion {
    public static void main(String[] args) throws Exception {
        try(Conexion con = new Conexion()){//try con recursos
            con.leerDatos();
        }catch(IllegalStateException ex){
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }
       /* Conexion con = null;
        try{
            con = new Conexion();
            con.leerDatos();
        }catch(IllegalStateException ex){
            ex.printStackTrace();
        }finally{// Si es exitoso o erroneo se ejecuta
            System.out.println("Ejecutando finally");
            if(con != null){
                con.cerrar();
            }
        }*/
    }
}
