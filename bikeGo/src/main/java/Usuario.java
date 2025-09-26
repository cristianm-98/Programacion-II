public class Usuario {
    private String id;
    private String nombre;
    private String telefono;
    private String direccion;

    private Usuario(Builder builder){
        this.id=builder.id;
        this.nombre=builder.nombre;
        this.telefono=builder.telefono;
        this.direccion=builder.direccion;
    }
    public static class Builder {
        public String id;
        public String nombre;
        public String telefono;
        public String direccion;

        public Builder id(String id) {
            this.id = id;
            return this;
        }
        public Builder nombre(String nombre){
            this.nombre=nombre;
            return this;
        }
        public Builder telefono(String telefono){
            this.telefono=telefono;
            return this;
        }
        public Builder direccion(String telefono){
            this.direccion=direccion;
            return this;
        }
        public Usuario build(){
            return new Usuario(this);
        }
    }
    public String getid(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    @Override
    public String toString (){
        return id + " " + nombre + " " + telefono + " " + telefono;

    }
}
