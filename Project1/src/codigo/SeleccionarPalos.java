/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.util.Random;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author gara8
 */
public class SeleccionarPalos {
    
    Random random = new Random();
    
    public void seleccionarPalos(JLabel fuerte, JLabel debil, JLabel regular1, JLabel regular2) {
        int value = random.nextInt(4) + 1;
        int value2 = random.nextInt(3) + 1;
        ImageIcon corazon = new ImageIcon(getClass().getResource("/imagenes/corazon.png"));
        ImageIcon trebol = new ImageIcon(getClass().getResource("/imagenes/trebol.png"));
        ImageIcon pica = new ImageIcon(getClass().getResource("/imagenes/pica.png"));
        ImageIcon diamante = new ImageIcon(getClass().getResource("/imagenes/diamante.png"));
        
        if (value == 1) {
            fuerte.setToolTipText("Corazones");
            fuerte.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            fuerte.setOpaque(false);
            fuerte.setHorizontalTextPosition(AbstractButton.CENTER);
            fuerte.setVerticalTextPosition(AbstractButton.CENTER);
            if (value2 == 1) {
                debil.setToolTipText("Treboles");
                debil.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Picas");
                regular1.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Diamantes");
                regular2.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else if (value2 == 2) {
                debil.setToolTipText("Picas");
                debil.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Treboles");
                regular1.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Diamantes");
                regular2.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else {
                debil.setToolTipText("Diamantes");
                debil.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Picas");
                regular1.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Treboles");
                regular2.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            }
        }else if (value == 2) {
            fuerte.setToolTipText("Treboles");
            fuerte.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            fuerte.setOpaque(false);
            fuerte.setHorizontalTextPosition(AbstractButton.CENTER);
            fuerte.setVerticalTextPosition(AbstractButton.CENTER);
            if (value2 == 1) {
                debil.setToolTipText("Corazones");
                debil.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Picas");
                regular1.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Diamantes");
                regular2.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else if (value2 == 2) {
                debil.setToolTipText("Picas");
                debil.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Corazones");
                regular1.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Diamantes");
                regular2.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else {
                debil.setToolTipText("Diamantes");
                debil.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Picas");
                regular1.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Corazones");
                regular2.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            }
        }else if (value == 3) {
            fuerte.setToolTipText("Picas");
            fuerte.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            fuerte.setOpaque(false);
            fuerte.setHorizontalTextPosition(AbstractButton.CENTER);
            fuerte.setVerticalTextPosition(AbstractButton.CENTER);
            if (value2 == 1) {
                debil.setToolTipText("Treboles");
                debil.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Corazones");
                regular1.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Diamantes");
                regular2.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else if (value2 == 2) {
                debil.setToolTipText("Corazones");
                debil.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Treboles");
                regular1.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Diamantes");
                regular2.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else {
                debil.setToolTipText("Diamantes");
                debil.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Corazones");
                regular1.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Treboles");
                regular2.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            }
        } else {
            fuerte.setToolTipText("Diamantes");
            fuerte.setIcon(new ImageIcon(diamante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            fuerte.setOpaque(false);
            fuerte.setHorizontalTextPosition(AbstractButton.CENTER);
            fuerte.setVerticalTextPosition(AbstractButton.CENTER);
            if (value2 == 1) {
                debil.setToolTipText("Treboles");
                debil.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Picas");
                regular1.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Corazones");
                regular2.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else if (value2 == 2) {
                debil.setToolTipText("Picas");
                debil.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Treboles");
                regular1.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Corazones");
                regular2.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            } else {
                debil.setToolTipText("Corazones");
                debil.setIcon(new ImageIcon(corazon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                debil.setOpaque(false);
                debil.setHorizontalTextPosition(AbstractButton.CENTER);
                debil.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular1.setToolTipText("Picas");
                regular1.setIcon(new ImageIcon(pica.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular1.setOpaque(false);
                regular1.setHorizontalTextPosition(AbstractButton.CENTER);
                regular1.setVerticalTextPosition(AbstractButton.CENTER);
                
                regular2.setToolTipText("Treboles");
                regular2.setIcon(new ImageIcon(trebol.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
                regular2.setOpaque(false);
                regular2.setHorizontalTextPosition(AbstractButton.CENTER);
                regular2.setVerticalTextPosition(AbstractButton.CENTER);
            }
        }
    }
}
