/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

import javax.swing.JOptionPane;

/**
 *
 * @author yuravs
 */
public class StoreAdmin {
    public static void main(String[] args) {
        String coke = JOptionPane.showInputDialog("How many cokes do you want");
        String barones = JOptionPane.showInputDialog("How many barones do you want");
        String water  = JOptionPane.showInputDialog("How many water  do you want");
        
        int coke_int = Integer.parseInt(coke);
        int bar_int = Integer.parseInt(barones);
        int water_int = Integer.parseInt(water);
        
        double Totalprice = (coke_int * 13.90) + (bar_int * 12) + (water_int * 9.5);
        
        System.out.println(Totalprice);
                
        
    }
}
