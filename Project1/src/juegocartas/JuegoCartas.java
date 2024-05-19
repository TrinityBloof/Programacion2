/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocartas;

/**
 *
 * @author gara8
 */
public class JuegoCartas implements Runnable {

    public GUI gui = new GUI();
    
    public static void main(String[] args) {
        new Thread(new JuegoCartas()).start();
    }

    @Override
    public void run() {
        while(true) {
            gui.repaint();
            gui.setVisible(true);
        }
    }
    
}
