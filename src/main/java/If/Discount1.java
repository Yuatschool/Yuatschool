/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If;

import javax.swing.JOptionPane;

/**
 *
 * @author yuravs
 */
public class Discount1 {
    public static void main(String[] args) {
        double price=0, discount, qty_bought = 0;
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price"));
        
        if(price >= 50 | qty_bought >= 10)
        { discount = price * 10/100;    }   
        
            
    }
}
