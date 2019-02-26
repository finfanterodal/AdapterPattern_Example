package exehashmap_cod;

/**
 *
 * @author finfanterodal
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* //Creamos
        ClassList list1 = new ClassList();
        //Añadimos valores
        list1.putElement("0");
        list1.putElement("1");
        list1.putElement("2");
        //Mostramos
        MostrarList.mostrar(list1);
         */
        //Creamos
        ClassHash miHash = new ClassHash();
        //Añadimos valores
        miHash.putValue(0, "cero");
        miHash.putValue(1, "uno");
        miHash.putValue(2, "dos");
        miHash.putValue(3, "tres");
        //Adaptamos el Hash a una Lista
        Hash2List miHash2List = new Hash2List(miHash);

        //Mostraramos nuestro Hash con el método MostrarList
        MostrarList.mostrar(miHash2List);
    }

}
