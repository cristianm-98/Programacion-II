public class BicicletaConvencional extends Bicicleta {

    private BicicletaConvencional(Builder builder){
        super(builder.id, builder.disponible, builder.kilometro);
    }
    public static class Builder{
        private String id;
        private boolean disponible;
        private double kilometro;

        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder disponible(boolean disponible){
            this.disponible=disponible;
            return this;
        }
        public Builder kilometro(double kilometro) {
            this.kilometro = kilometro;
            return this;
        }
        public BicicletaConvencional build(){
            return new BicicletaConvencional(this);
        }
    }

    @Override
    public int tarifaHora(){
        return 1000;
    }
}
