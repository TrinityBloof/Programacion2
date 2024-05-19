/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gara8
 */
public class Limpiar {
    ObtenerTamanioObjetos obtener = new ObtenerTamanioObjetos();
    
    public int limpia(JButton [][] MatrizBotones, JTextField text, int contadorLimpias, JTextField text2) {
        int contadorX, contadorY, forFix = 0, tamano;
        loops:
            for (contadorX = 0; contadorX < 8; contadorX++) {
                for (contadorY = 0; contadorY < 8; contadorY++) {
                    JButton revisar = MatrizBotones[contadorX][contadorY];
                    if ("Sucio".equals(revisar.getToolTipText()) && "Robot".equals(revisar.getText())) {
                        String[] options = new String[] {"Si", "No"};
                        int response = JOptionPane.showOptionDialog(null, "¿Desea limpiar aquí?", "Confirmación",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
                        if (response == 0) {
                            revisar.setToolTipText("Limpio");
                            revisar.setIcon(null);
                            ImageIcon pisoLimpio = new ImageIcon("build/classes/imagenes/piso.jpg");
                            tamano = obtener.ObtenerTamanioObjetos(8);
                            revisar.setIcon(new ImageIcon(pisoLimpio.getImage().getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT)));
                            revisar.setOpaque(false);
                            revisar.setHorizontalTextPosition(AbstractButton.CENTER);
                            revisar.setVerticalTextPosition(AbstractButton.CENTER);
                            forFix++;
                            contadorLimpias++;
                            String sss =String.valueOf(contadorLimpias);
                            text.setText(sss);
                            if(contadorLimpias >= 1) {
                                int calculoPorcentaje = (contadorLimpias*100)/32;
                                int restante = 100 - calculoPorcentaje;
                                if (contadorLimpias == 32) {
                                    text2.setText("0 %");
                                }else {
                                    text2.setText(String.valueOf(restante) + " %");
                                }
                            }
                            JOptionPane.showMessageDialog(null, "Limpiado");
                            return contadorLimpias;
                        }
                        if (response == 1) {
                            JOptionPane.showMessageDialog(null, "No limpiado");
                            forFix++;
                            break loops;
                        }
                    }
                }
            }
        if (forFix == 1) {
                
        }else {
            JOptionPane.showMessageDialog(null, "Este espacío no se puede limpiar");
        }
        return contadorLimpias;
    }
    
}
