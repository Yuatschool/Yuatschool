/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author yuravs
 */
public class MethodIntro {
    
    public static void main(String[] args) {
        int num = sum(18,8);
        System.out.println(num);
        
        
        double areac = areaOfCircle(8);
        System.out.println(areac);
        
        
        double i = sum(10,4);
        System.out.println(i);
    }
    
    public static int sum(int a,int b){
        int total = a + b;
        return total;
    }

    public static double areaOfCircle(double radius){
        double area = radius;
        return area;
        
    }
     public static double add(double a ,double b){
         double input = a + b;
         return input;
     }  
        
        
        
    
    
}
