/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gara8
 */
public class Click {
ValidarMovimiento validar = new ValidarMovimiento();
    public int clickEvento(JButton btn, JButton[][] MatrizBotones, JTextField text, int contador) {
        int contadorX, contadorY, forFix = 0;
        loops:
        for (contadorX = 0; contadorX < 8; contadorX++) {
            for (contadorY = 0; contadorY < 8; contadorY++) {
                JButton revisar = MatrizBotones[contadorX][contadorY];
                if ("Robot".equals(revisar.getText())) {
                    String posActual = revisar.getName();
                    String posNext = btn.getName();
                    String estado = btn.getToolTipText();
                    String estado2 = revisar.getToolTipText();
                    boolean validado = validar.validaMov(posActual, posNext, estado, estado2);
                    if (validado) {
                        forFix++;
                        revisar.setText("");
                        btn.setText("Robot");
                        contador++;
                        String sss =String.valueOf(contador);
                        text.setText(sss);
                        break loops;
                    }
                }
            }
        }
        if (forFix == 1) {
                
        }else {
            JOptionPane.showMessageDialog(null, "Esta celda se encuentra muy lejos o tiene algún obstaculo");
        }
    return contador;
    }
}
