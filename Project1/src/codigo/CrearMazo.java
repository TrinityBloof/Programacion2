/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import database.BDCartas;
import objetos.objCartas;

/**
 *
 * @author gara8
 */
public class CrearMazo {
    
    BDCartas bdcartas = new BDCartas();
    
    public ArrayList<objCartas> LeerMazoObjetos() {
        ArrayList<objCartas> listaCartas = bdcartas.masoCartas();
        return listaCartas;
    }
}
