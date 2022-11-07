/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basitAlistirmalar;

/**
 *
 * @author ahmet.kilic1
 */
public class ArkadasSayiBulma {
    public static void main(String[] args) {
     int number1 = 220;
    int number2=284;
    int total1=0;
    int total2=0;
    
        for (int i = 1; i < number1; i++) {
            if (number1%i==0) {
                total1 = total1 + i;
                
            }
            
        }
        
         for (int i = 1; i < number2; i++) {
            if (number2%i==0) {
                total2 = total2 + i;
                
            }
            
        }
         
         if (number1 == total2 && number2==total1) {
             System.out.println("Bu sayılar arkadaştır");
        } else {
             System.out.println("Bu sayılar adaş değildir");
         }
    
    }
    
}
