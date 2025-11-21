public class AdminFactory implements PersonaFactory{

    @Override
    public Persona crearPersona(String documento, String nombre, String apellido, String direccion, String telefono, String correo) {
        return new Admin(documento,nombre,apellido,direccion,telefono,correo);
    }
}
