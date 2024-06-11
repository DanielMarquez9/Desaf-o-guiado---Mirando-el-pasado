import java.util.Set;
import java.util.TreeSet;

public class ListaDeInvitados {

    public static void main(String[] args) {
        Set<String> invitados = new TreeSet<>();

        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        System.out.println("Listado de invitados:");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }

        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);

        System.out.println("\ndespués de agregar posibles invitados:");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }

        boolean removed = invitados.remove("Jorge");
        System.out.println("\n¿'Jorge' fue eliminado?: " + removed);

        System.out.println("\nListado final de invitados:");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }
    }
}
