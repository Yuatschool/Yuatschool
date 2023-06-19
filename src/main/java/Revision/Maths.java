/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

/**
 *
 * @author yuravs
 */
public class Maths {
    public static void main(String[] args) {
        
        
//        [4,11) - 4, 5, 6, 7, 8, 9, 10
//        [4,10) - 4, 5, 6, 7, 8, 9
//        (4,10) - 5, 6, 7, 8, 9
        int min = 90;
        int max = 111;
        int range = max-min;
       int num = (int)(Math.random()*range+min);
       
        System.out.println(num);
        
    }
}
