/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basitAlistirmalar;

/**
 *
 * @author ahmet.kilic1
 */
public class SayiAsalMi {
    public static void main(String[] args) {
        int number  = 25;
        int remainder = number %2;
        boolean isPrime= true;
        
        if (number<2 ) {
            System.out.println("Sayı asal değildir");
            return;
        }
      
        for( int i = 2; i<number; i++) {
            if (number %i ==0) {
                isPrime = false;
            }
        
        }
        if ( isPrime) {
            System.out.println("sayı asaldır");
        } else {
        
            System.out.println("sayı asal değildir");}
        
    }
    
}
