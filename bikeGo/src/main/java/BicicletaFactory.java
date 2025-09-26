public class BicicletaFactory {

    public static Bicicleta crearBicicleta(String tipo, String id, boolean disponible, double kilometro, Integer capacidadBateria) {
        switch (tipo.toLowerCase()) {
            case "electrica":
                return new BicicletaElectrica.Builder()
                        .id(id)
                        .disponible(disponible)
                        .kilometro(kilometro)
                        .capacidadBateria(capacidadBateria)
                        .build();
            case "convencional":
                return new BicicletaConvencional.Builder()
                        .id(id)
                        .disponible(disponible)
                        .kilometro(kilometro)
                        .build();
            default:
                System.out.println("Tipo de bicicleta no es valido: " + tipo);
                return null;
        }
    }
}
