package exehashmap_cod;

import java.util.ArrayList;

/**
 * Clase que implementa la interfaz InterfaceHash, crea un ArrayList y define
 * los métodos.
 *
 * @author finfanterodal
 */
public class ClassList implements InterfaceList {

    /**
     * Declaración de un ArrayList pública para poder acceder a el desde otras
     * clases.
     */
    public ArrayList<String> lista = new ArrayList<>();

    /**
     * Método para añadir un elemento al ArrayList.
     *
     * @param value valor del elemento.
     */
    @Override
    public void putElement(String value) {
        lista.add(value);
    }

    /**
     * Método que devuelve el valor de un elemento según la posición.
     *
     * @param posicion
     * @return
     */
    @Override
    public String getElement(int posicion) {
        return lista.get(posicion - 1);
    }

}
