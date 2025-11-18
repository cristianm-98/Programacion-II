import java.util.ArrayList;

public abstract class Bicicleta {
    private String id;
    private boolean disponible;
    private double kilometro;
    private ArrayList<Alquiler>alquilers=new ArrayList<>();

    public Bicicleta (String id, boolean disponible, double kilometro){
        this.id=id;
        this.disponible=disponible;
        this.kilometro=kilometro;
    }

    public String getId(){
        return id;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public double getKilometro(){
        return kilometro;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
    public void setKilometro(double kilometro) {
        this.kilometro=kilometro;
    }
    public abstract int tarifaHora();

    public String estadoBicicleta() {
        if(disponible){
            return "Disponible";
        }else{
            return "No disponible";
        }
    }
}

