/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exehashmap_cod;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author finfanterodal
 */
public class Hash2List extends ClassList {
//Recibimos en el constructor un ClassHash, y hacemos la adaptación

    public Hash2List(ClassHash auxHash) {
        //Recorrer HashMap con Iterator y lo añadimos al ArrayList
        Iterator it = auxHash.miHashOriginal.keySet().iterator();
        while (it.hasNext()) {
            lista.add(auxHash.miHashOriginal.get(it.next()));
        }
    }

}
