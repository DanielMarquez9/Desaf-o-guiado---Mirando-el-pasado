import java.util.ArrayList;

public class ListaDeMarcas {

    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();

        marcas.add("Kodak");
        marcas.add("Nokia");
        marcas.add("Sears");
        marcas.add("Pan Am");
        marcas.add("MySpace");
        marcas.add("Compaq");
        marcas.add("Palm");
        marcas.add("Atari");
        marcas.add("Circuit City");
        marcas.add("Tower Records");

        System.out.println("Listado de marcas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.println("\nmarcas de la amiga:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        int indexBlokbaster = marcas.indexOf("Blokbaster");
        if (indexBlokbaster != -1) {
            marcas.set(indexBlokbaster, "Blockbuster");
        }

        System.out.println("\n'Blokbaster' a 'Blockbuster':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        boolean removed = marcas.remove("Carrefour");
        System.out.println("\n¿'Carrefour' fue eliminado?: " + removed);

        System.out.println("\neliminar 'Carrefour':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Yahoo!");
        posiblesMarcas.add("AOL");
        posiblesMarcas.add("BlackBerry");

        marcas.addAll(posiblesMarcas);

        System.out.println("\nposibles marcas fuera del mercado:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        int numeroDeMarcas = marcas.size();
        System.out.println("\nNúmero total de marcas en el listado: " + numeroDeMarcas);
    }
}
