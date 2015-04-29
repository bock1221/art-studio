/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artstudio;

import java.awt.BorderLayout;
import javax.swing.*;


/**
 *
 * @author zvibock
 */
public class ArtStudio extends JFrame {

   public  ArtStudio(){
 /*  Toolkit tk = Toolkit.getDefaultToolkit();
   int W=((int)tk.getScreenSize().getHeight());
   int H=((int)tk.getScreenSize().getHeight());
   setSize(W, H);*/
     setExtendedState(this.MAXIMIZED_BOTH);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
     ImageIcon icon = new ImageIcon("images/new.png");
     ImageIcon icon1 = new ImageIcon("images/load.png");
     ImageIcon icon2 = new ImageIcon("images/saveas.png");
     ImageIcon icon3 = new ImageIcon("images/undo_1.png");
     ImageIcon icon4 = new ImageIcon("images/redo_1.png");
     ImageIcon icon5 = new ImageIcon("images/pencil.png");
     JToolBar toolbar=new JToolBar();
     JToolBar toolbar1=new JToolBar();
     
     MyJpanel jpanel= new MyJpanel();
     add(jpanel,BorderLayout.CENTER);
    
     JButton button1 =new JButton(icon);
     JButton button2 =new JButton(icon1);
     JButton button3 =new JButton(icon2);
     
     JButton button4 =new JButton(icon3);
     JButton button5 =new JButton(icon4);
     JButton button6 =new JButton(icon5);
     
     button1.setIconTextGap(14);
     button1.setText("New");
     button2.setIconTextGap(14);
     button2.setText("Open");
     button3.setIconTextGap(14);
     button3.setText("Save");
     button4.setIconTextGap(14);
     button4.setText("Undo");
     button5.setIconTextGap(14);
     button5.setText("Redo");
     button6.setIconTextGap(14);
     button6.setText("Pencil");
     toolbar.add(button1);
     toolbar.add(button2);
     toolbar.add(button3);
     toolbar.addSeparator();
     toolbar.addSeparator();
     toolbar.add(button4);
     toolbar.add(button5);
     toolbar.add(button6);
     add(toolbar,BorderLayout.NORTH);
     setVisible(true);
   }
    public static void main(String[] args) {
       new ArtStudio();
    }
}
