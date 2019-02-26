/*
 *Crear Interface Hash que tiene métodos para trabajar con un HAshMap:
 * putValue (Meter un valor)
 * pushValue (Recoger un valor)
 */
package exehashmap_cod;

import Utilities.PedirDatos;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public interface InterfaceHash {

    public void putValue(Integer key, String value);

    public String getValue(Integer key);

}
