/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author yuravs
 */
public class NumChars {

    public static void main(String[] args) {
        int num, posn;
        String wrd = JOptionPane.showInputDialog("Type any word", "<Enter>");
        num = wrd.length();

        if (num % 2 == 1) {
            System.out.println(wrd + " has an odd number of letters.");
            posn = num / 2;
            System.out.println("The middle letter is " + wrd.charAt(posn ));
        } else {
            System.out.println(wrd + " has an even number of letters.");
        }

    }

}
