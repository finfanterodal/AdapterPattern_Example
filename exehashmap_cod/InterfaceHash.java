/*
 *Crear Interface Hash que tiene métodos para trabajar con un HAshMap:
 * putValue (Meter un valor)
 * pushValue (Recoger un valor)
 */
package exehashmap_cod;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 * Interface Hash que tiene métodos para trabajar con un HAshMap.
 *
 * @author finfanterodal
 */
public interface InterfaceHash {

    /**
     *
     * @param key clave del elemento.
     * @param value valor del elemento.
     */
    public void putValue(Integer key, String value);

    /**
     *
     * @param key valor de la clave.
     * @return
     */
    public String getValue(Integer key);

}
