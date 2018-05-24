/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1a1_greetings;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Robbie Pierik
 */
public class U1A1_Greetings extends JFrame{
    public U1A1_Greetings() {
        super("About Me.");
        setSize(1440, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JLabel pageLabel = new JLabel("<html>My name is Robert Pierik. I attend Sacred Heart High School.<br>I ually listen to Rock or Metal music. My favourite TV show is Breaking Bad.<br>My favourite colour is blue.<br> I LOVE PROGRAMMING!</html>");
        pageLabel.setFont (pageLabel.getFont ().deriveFont (32.0f));
        FlowLayout flo = new FlowLayout();        
        setLayout(flo);
        add(pageLabel);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        U1A1_Greetings greet = new U1A1_Greetings();
    }
    
}
