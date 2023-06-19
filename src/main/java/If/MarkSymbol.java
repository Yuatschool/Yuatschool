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
public class MarkSymbol {

    public static void main(String[] args) {

        int mark;
        mark = Integer.parseInt(JOptionPane.showInputDialog("Enter the mark from 0 to 100"));

        if (mark >= 80) {
            System.out.println("A");

        } else if (mark >= 70) {
            System.out.println("B");
        } else if (mark >= 60) {
            System.out.println("C");

        } else if (mark >= 50) {
            System.out.println("D");

        } else if (mark < 50) {
            System.out.println("E");

        }

    }
}
