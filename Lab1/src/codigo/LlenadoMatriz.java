/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gara8
 */
public class LlenadoMatriz {

    private int contador1 = 23, contador2 = 32, contador3 = 9;
    public int [][] A = new int[8][8];//21 bien, 32 mal, 8 con errores
    int tamano = 0, contador = 0;
    ObtenerTamanioObjetos obtener = new ObtenerTamanioObjetos();
    Click clickevento = new Click();
    String estadoBoton = "";
    JButton[][] MatrizBotones;

    public JButton[][] llenarMatriz(JPanel jPanel1, JTextField jTextField1, JTextField jTextField2, JTextField jTextField3) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 && j == 0) {
                    A[i][j] = 1;
                } else {
                    do {
                        int rn2 = (int) (Math.random() * 3) + 1;
                        if (rn2 == 1 && contador1 > 0) {
                            A[i][j] = 1;
                            contador1--;
                        } else if (rn2 == 2 && contador2 > 0) {
                            A[i][j] = 2;
                            contador2--;
                        } else if (rn2 == 3 && contador3 > 0) {
                            int rn4 = (int) (Math.random() * 3) + 1;
                            switch (rn4) {
                                case 1 -> {
                                    A[i][j] = 3;
                                    contador3--;
                                }
                                case 2 -> {
                                    A[i][j] = 4;
                                    contador3--;
                                }
                                case 3 -> {
                                    A[i][j] = 5;
                                    contador3--;
                                }
                                default -> {
                                    A[i][j] = 0;
                                }
                            }
                        }
                    } while (A[i][j] == 0);
                }
            }
        }
        
        MatrizBotones = new JButton[8][8];
        jPanel1.setLayout(new GridLayout(8,8));
        tamano = obtener.ObtenerTamanioObjetos(8);
        int contadorX, contadorY;
        for (contadorX = 0; contadorX < 8; contadorX++) {
            for (contadorY = 0; contadorY < 8; contadorY++) {
                JButton btnNuevo = new JButton();
                btnNuevo.setSize(tamano, tamano);
                if (contadorX == 0 && contadorY == 0) {
                    btnNuevo.setText("Robot");
                    btnNuevo.setToolTipText("Limpio");
                    ImageIcon pisoLimpio = new ImageIcon("build/classes/imagenes/piso.jpg");
                    btnNuevo.setIcon(new ImageIcon(pisoLimpio.getImage().getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT)));
                    btnNuevo.setOpaque(false);
                    btnNuevo.setHorizontalTextPosition(AbstractButton.CENTER);
                    btnNuevo.setVerticalTextPosition(AbstractButton.CENTER);
                } else if (A[contadorX][contadorY] == 2) {
                    btnNuevo.setToolTipText("Sucio");
                    ImageIcon pisoLimpio = new ImageIcon("build/classes/imagenes/polvo.png");
                    btnNuevo.setIcon(new ImageIcon(pisoLimpio.getImage().getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT)));
                    btnNuevo.setOpaque(false);
                    btnNuevo.setHorizontalTextPosition(AbstractButton.CENTER);
                    btnNuevo.setVerticalTextPosition(AbstractButton.CENTER);
                } else if (A[contadorX][contadorY] == 3) {
                    btnNuevo.setToolTipText("Pared");
                    ImageIcon pisoLimpio = new ImageIcon("build/classes/imagenes/pared.png");
                    btnNuevo.setIcon(new ImageIcon(pisoLimpio.getImage().getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT)));
                    btnNuevo.setOpaque(false);
                    btnNuevo.setHorizontalTextPosition(AbstractButton.CENTER);
                    btnNuevo.setVerticalTextPosition(AbstractButton.CENTER);
                }else if (A[contadorX][contadorY] == 4) {
                    btnNuevo.setToolTipText("Suelo");
                    ImageIcon pisoLimpio = new ImageIcon("build/classes/imagenes/suelo.png");
                    btnNuevo.setIcon(new ImageIcon(pisoLimpio.getImage().getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT)));
                    btnNuevo.setOpaque(false);
                    btnNuevo.setHorizontalTextPosition(AbstractButton.CENTER);
                    btnNuevo.setVerticalTextPosition(AbstractButton.CENTER);
                }else if (A[contadorX][contadorY] == 5) {
                    btnNuevo.setToolTipText("Techo");
                    ImageIcon pisoLimpio = new ImageIcon("build/classes/imagenes/techo.png");
                    btnNuevo.setIcon(new ImageIcon(pisoLimpio.getImage().getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT)));
                    btnNuevo.setOpaque(false);
                    btnNuevo.setHorizontalTextPosition(AbstractButton.CENTER);
                    btnNuevo.setVerticalTextPosition(AbstractButton.CENTER);
                }else if (A[contadorX][contadorY] == 1) {
                    btnNuevo.setToolTipText("Limpio");
                    ImageIcon pisoLimpio = new ImageIcon("build/classes/imagenes/piso.jpg");
                    btnNuevo.setIcon(new ImageIcon(pisoLimpio.getImage().getScaledInstance(tamano, tamano, Image.SCALE_DEFAULT)));
                    btnNuevo.setOpaque(false);
                    btnNuevo.setHorizontalTextPosition(AbstractButton.CENTER);
                    btnNuevo.setVerticalTextPosition(AbstractButton.CENTER);
                }
                btnNuevo.setName(Integer.toString(contadorX) + "," + Integer.toString(contadorY));
                MatrizBotones[contadorX][contadorY] = btnNuevo;
                MatrizBotones[contadorX][contadorY].addActionListener(new ActionListener() { 
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int contador2 = clickevento.clickEvento(btnNuevo, MatrizBotones, jTextField3, contador);
                        contador = contador2;
                    }
                });
                jPanel1.add(MatrizBotones[contadorX][contadorY]);
                jPanel1.validate();
                jPanel1.repaint();
                jTextField1.setText("100 %");
                jTextField2.setText("0");
                jTextField3.setText("0");
            }
        }
        return MatrizBotones;
    }
}
