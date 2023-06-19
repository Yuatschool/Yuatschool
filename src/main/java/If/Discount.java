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
public class Discount {

    public static void main(String[] args) {

        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the number"));

        double discount;
        if (price < 100) {
            System.out.println("You will not recieve discount");
            System.out.println(price);
        } else {
            System.out.println("you will recive discount");
            discount = price * 0.1;
            double finalPrice = price - discount;

            System.out.println(finalPrice);
        }

    }
}
