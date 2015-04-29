/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artstudio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author zvibock
 */
public class MyJpanel extends JPanel{
   Point pointStart=null;
   Point  pointEnd=null;
   public ArrayList<Points> lines= new ArrayList<>();
   public MyJpanel(){
     addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    pointStart = e.getPoint();
                }

                public void mouseReleased(MouseEvent e) {
                    Points line=new Points(pointStart,pointEnd);
                    lines.add(line);
                    pointStart = null;
                }
            });
            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseMoved(MouseEvent e) {
                    pointEnd = e.getPoint();
                }

                public void mouseDragged(MouseEvent e) {
                    pointEnd = e.getPoint();
                    repaint();
                }
            });
        }
    @Override
      public void paint(Graphics g) {
            super.paint(g);
            if (pointStart != null) {
                
                g.setColor(Color.RED);
                for(Points savedPoint :lines){
                g.drawLine(savedPoint.getPointStart().x, savedPoint.getPointStart().y, savedPoint.getPointEnd().x, savedPoint.getPointEnd().y); 
                }
                g.drawLine(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
                //lines.add(g);
            }
    }
    
}


