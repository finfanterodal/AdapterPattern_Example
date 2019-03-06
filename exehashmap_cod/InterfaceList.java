/*
 *Crear Interface List que tiene métodos para trabajar con un ArrayList:
 * putElement (Meter un valor)
 * pushElement (Recoger un valor)
 */
package exehashmap_cod;

/**
 * Interface List que tiene métodos para trabajar con un ArrayList.
 * @author finfanterodal
 */
public interface InterfaceList {

    /**
     *
     * @param value valor del elemento.
     */
    public void putElement(String value);

    /**
     *
     * @param posicion posicion del elemento.
     * @return valor del elemento.
     */
    public String getElement(int posicion);

}
