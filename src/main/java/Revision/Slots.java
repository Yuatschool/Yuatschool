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
public class Slots {
    public static double totalMoneyWon = 0;
    
    public static int onePlay(){
        int onePlayScore =  0;
        int intA = (int)'A';
        int pointsWon = 0;
        for (int i = 1;i<=3; i++) {
            
            int intRan = (int)(Math.random()*(26) );
            char ran = (char)(intA + intRan);
            System.out.print(ran+" ");
            onePlayScore += (int)ran;
            pointsWon = onePlayScore;
            
        }
        int prizeWon = 0;
         if(onePlayScore>=200&&onePlayScore<=210)
        {
            prizeWon=5;
        }
        else if(onePlayScore>=210&&onePlayScore<=240)
        {
            prizeWon=10;
        }
        else if(onePlayScore>=210&&onePlayScore<=270)
        {
            prizeWon=20;
        }
        
        
        
        
        return onePlayScore;
    }
     
    public static void main(String[] args) {
        int score = onePlay();
        int intRan= onePlay();
        int points = onePlay();
            System.out.print(intRan+ " ");
            System.out.print("Summary of play");
            System.out.print();
        
        
        
                
    }
}
