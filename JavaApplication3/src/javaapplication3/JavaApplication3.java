
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
* @author robbi
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaApplication3  extends Component{

    /**
     * @param args the command line arguments
     */
    static BufferedImage img = null;
    
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
    
    public static void main(String[] args) {
        
        JavaApplication3 game = new JavaApplication3();
        
        JFrame frame = new JFrame("Image Reader");
        frame.setSize(1080, 720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        
         frame.add(new LoadImageApp());
         frame.add(img)
        game.repaint();
        frame.pack();
        
       // } catch (URISyntaxException ex) {
         //   Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }

    private static class LoadImageApp extends PopupMenu {

        public LoadImageApp() {
             try {
            img = ImageIO.read(new File("C:\\Users\\robbi\\OneDrive\\Documents\\NetBeansProjects\\curly-fiesta\\JavaApplication3\\resources\\will.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

   
        
    }
    

