/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Rethabile
 */
public class MyFirstFrame extends JFrame{
    public MyFirstFrame(){
        setTitle("Rethabile Lebesana");
        setSize(200, 250);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        setForeground(Color.BLUE);
    }
}
