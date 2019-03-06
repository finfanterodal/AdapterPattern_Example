package exehashmap_cod;

import java.util.HashMap;

/**
 * Clase que implementa la interfaz InterfaceHash, crea un HashMap y define los
 * métodos.
 *
 * @author finfanterodal
 */
public class ClassHash implements InterfaceHash {

    /**
     * Declaración de HashMap pública para poder acceder a el desde otras
     * clases.
     */
    public HashMap<Integer, String> miHashOriginal = new HashMap();

    /**
     * Método par introducir un elemento en el HashMap
     *
     * @param key clave del elemento.
     * @param value valor del elemento.
     */
    @Override
    public void putValue(Integer key, String value) {
        miHashOriginal.put(key, value);
    }

    /**
     *
     * @param key clave del elemento
     * @return devuelve el valor correspondiente a la clave.
     */
    @Override
    public String getValue(Integer key) {
        return miHashOriginal.get(key);
    }
}
