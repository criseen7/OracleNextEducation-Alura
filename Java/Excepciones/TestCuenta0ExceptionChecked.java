public class TestCuenta0ExceptionChecked{
    public static void main(String[] args) {
        Cuenta0 cuenta = new Cuenta0();
        try {
            cuenta.deposita();
        } catch (MiException e) {//Try catch porque es un checked
            e.printStackTrace();
        } 
    }
}