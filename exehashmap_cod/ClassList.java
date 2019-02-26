/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exehashmap_cod;

import java.util.ArrayList;

/**
 *
 * @author finfanterodal
 */
public class ClassList implements InterfaceList {

    //
    public ArrayList<String> lista = new ArrayList<>();
    //

    public ClassList() {
    }

    //
    @Override
    public void putElement(String value) {
        lista.add(value);
    }

    @Override
    public String getElement(int posicion) {
        return lista.get(posicion - 1);
    }
    //

}
