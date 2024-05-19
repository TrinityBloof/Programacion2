/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import java.util.Random;
import objetos.objCartas;

/**
 *
 * @author gara8
 */
public class RepartirCartasJugador {
    
    int rand = new Random().nextInt(52);
    
    public ArrayList<objCartas> cartasJugador(ArrayList<objCartas> mazoCartas, ArrayList<objCartas> cartasJugador) {
        for (int i = 0; i<10; i++) {
            rand = new Random().nextInt(52);
            while (true) {            
                if (mazoCartas.get(rand).cartaUsada == false) {
                    cartasJugador.add(mazoCartas.get(rand));
                    mazoCartas.get(rand).cartaUsada = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }
        
        return cartasJugador;
    }
}
