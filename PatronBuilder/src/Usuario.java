public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;


    private Usuario (Builder builder){
        this.nombre=builder.nombre;
        this.apellido=builder.apellido;
        this.correo=builder.correo;
        this.telefono=builder.telefono;
        this.direccion=builder.direccion;
    }

    public static class Builder{
        private String nombre;
        private String apellido;
        private String correo;
        private String telefono;
        private String direccion;

        public Builder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
        public Builder apellido(String apellido){
            this.apellido=apellido;
            return this;
        }
        public Builder correo(String correo){
            this.correo=correo;
            return this;
        }
        public Builder telefono(String telefono){
            this.telefono=telefono;
            return this;
        }
        public Builder direccion(String direccion){
            this.direccion=direccion;
            return this;
        }

        public Usuario build(){
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return nombre + " " + apellido +" " + correo + " " + telefono + " " + direccion;
    }
}
