import java.util.Map;
import java.util.TreeMap;

public class ListaDeGolosinas {

    public static void main(String[] args) {
        Map<String, Integer> golosinas = new TreeMap<>();

        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);

        System.out.println("Listado de golosinas con sus precios:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " pesos");
        }

        System.out.println("\nGolosinas que costaban menos de 100 pesos:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " pesos");
            }
        }
    }
}
