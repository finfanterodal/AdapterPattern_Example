/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exehashmap_cod;

import java.util.HashMap;

/**
 *
 * @author finfanterodal
 */
public class ClassHash implements InterfaceHash {

    //Declaración de HashMap
    public HashMap<Integer, String> miHashOriginal = new HashMap();

    @Override
    public void putValue(Integer key, String value) {
        miHashOriginal.put(key, value);
    }

    @Override
    public String getValue(Integer key) {
        return miHashOriginal.get(key);
    }
}
