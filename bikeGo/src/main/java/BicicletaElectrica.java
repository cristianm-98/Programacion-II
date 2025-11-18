public class BicicletaElectrica extends Bicicleta {

    private int capacidadBateria;

    private BicicletaElectrica(Builder builder){
        super(builder.id,builder.disponible,builder.kilometro);
        this.capacidadBateria=builder.capacidadBateria;
    }
    public static class Builder{
        private String id;
        private boolean disponible;
        private double kilometro;
        private int capacidadBateria;

        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder disponible(boolean disponible){
            this.disponible=disponible;
            return this;
        }
        public Builder kilometro(double kilometro){
            this.kilometro=kilometro;
            return this;
        }
        public Builder capacidadBateria(int capacidadBateria){
            this.capacidadBateria=capacidadBateria;
            return this;
        }
        public BicicletaElectrica build(){
            return new BicicletaElectrica(this);
        }
    }

    public int getCapacidadBateria(){
        return capacidadBateria;
    }
    public void setCapacidadBateria(int capacidadBateria){
        this.capacidadBateria=capacidadBateria;
    }

    @Override
    public int tarifaHora() {
        return 2000;
    }
}
