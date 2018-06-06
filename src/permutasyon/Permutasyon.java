/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutasyon;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author sukru.okul
 */
public class Permutasyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PermutasyonGUI gUI = new PermutasyonGUI();
        gUI.setVisible(true);
        gUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        gUI.setLocation(dim.width / 2 - gUI.getSize().width / 2, dim.height / 2 - gUI.getSize().height / 2);
    }
    
}
