package exehashmap_cod;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que hereda de ClassList para poder adaptar el HashMap al ArrayList.
 * @author finfanterodal
 */
public class Hash2List extends ClassList {
//Recibimos en el constructor un ClassHash, y hacemos la adaptación

    /**
     *  Método que adapta el HasMap a un ArrayList.
     * @param auxHash 
     */

    public Hash2List(ClassHash auxHash) {
        //Recorrer HashMap con Iterator y lo añadimos al ArrayList
        Iterator it = auxHash.miHashOriginal.keySet().iterator();
        while (it.hasNext()) {
            lista.add(auxHash.miHashOriginal.get(it.next()));
        }
    }

}
