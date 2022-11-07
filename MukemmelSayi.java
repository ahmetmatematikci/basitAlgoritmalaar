/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basitAlistirmalar;

/**
 *
 * @author ahmet.kilic1
 */
public class MukemmelSayi {
    public static void main(String[] args) {
        
        int number = 6;
        int total = 0;
        
        for (int i = 1; i < number; i++) {
            if (number %i == 0) {
                total = total + i;
                
            }
            
        }
        
        if (total == number) {
            System.out.println("sayi mükemml sayidir : " + number);
        } else {
            System.out.println("Mükemml syi değildir");
        }
        
        
        
    }
    
}
