/*
 *Mostramos los valores de la clase ClassList
 *Utilizamos un objeto de clasList
 */
package exehashmap_cod;

/**
 *
 * @author finfanterodal
 */
public class MostrarList {

    public static void mostrar(ClassList lista) {
        System.out.printf("%10S %10S", "Value", "Index");
        for (int i = 0; i < lista.lista.size(); i++) {
            System.out.println("\n");
            System.out.printf("%8S %10d", lista.lista.get(i), i);
        }
        System.out.println("\n");
    }
}
