import java.util.LinkedList;
import java.util.Queue;

public class ListaDeJuegos {

    public static void main(String[] args) {
        Queue<String> juegos = new LinkedList<>();

        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        System.out.println("Listado de juegos:");
        for (String juego : juegos) {
            System.out.println(juego);
        }
        
        int cantidadDeJuegos = juegos.size();
        System.out.println("\nNúmero total de juegos en la lista: " + cantidadDeJuegos);
    }
}
