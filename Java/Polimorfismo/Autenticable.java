
public interface Autenticable {

    public void setClave(String Clave);
    public boolean iniciarSesion(String clave);
    
}//La interface no puede tener metodos implementados (con cuerpo)
//toda interface es abstracta y no puede extender de una clase