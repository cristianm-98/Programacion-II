import java.util.ArrayList;
import java.util.*;

public class Empresa {

    private static Empresa instance;
    private String nit;
    private String nombre;
    private ArrayList<Bicicleta>bicicletas = new ArrayList<>();
    private ArrayList<Usuario>usuarios = new ArrayList<>();
    private ArrayList<Alquiler>alquilers = new ArrayList<>();

    private Empresa() {
        this.nit = "81000";
        this.nombre = "BikeGo";

    }
    public static Empresa getInstance(){
        if(instance== null){
            instance=new Empresa();
        }
        return instance;
    }
    public String getNit(){
        return nit;
    }
    public String getNombre(){
        return nombre;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Alquiler> getAlquilers() {
        return alquilers;
    }

    //Metodo agregar
    public void agregarBicicleta(Bicicleta bicicleta){
        this.bicicletas.add(bicicleta);
    }
    public int buscarBicicleta(Bicicleta bicicleta,String id){
        int pos=-1;
        for(int i=0; i<bicicletas.size();i++){
            if(bicicletas.get(i).getId().equals(id)){
                pos=i;
                break;
            }
        }
        return pos;
    }
}

