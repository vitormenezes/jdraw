/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import model.Circulo;
import model.FormaGeometrica;

/**
 *
 * @author vitto
 */


public class Draw extends JPanel {
    
    public void paintComponent(Circulo c,Graphics g,int x, int y){
        super.paintComponent(g);
        System.out.printf("Eixo x: "+x+" eixo y: "+y);
        g.drawOval(x-c.getRaio(), y-c.getRaio(), 2*c.getRaio(), 2*c.getRaio());
    }
    
    
    
    

    public Draw() {
    }
            
    
    
}
