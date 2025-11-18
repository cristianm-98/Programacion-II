import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        leerArchivo(libros);

        //Para recorrer la lista
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo()+ " " + libro.getAutor() + " " + libro.getEditorial()+ " " + libro.getAnio());
        }
    }

    private static void leerArchivo(List<Libro> lista) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("D:\\UNIQUINDIO\\SEMESTRES\\2025-2\\Programacion II\\LibroBD\\Libro\\src\\BDLibro\\Libro_BD.txt"));
            String linea = " ";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split("\t");
                if(bloques.length==4) {
                    String titulo = bloques[0];
                    String autor = bloques[1];
                    String editorial = bloques[2];
                    int anio = Integer.parseInt(bloques[3]);
                    lista.add(new Libro(titulo,autor,editorial,anio));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }

    }
}