/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basitAlistirmalar;

/**
 *
 * @author ahmet.kilic1
 */
public class DiziToplam {
    public static void main(String[] args) {
        
        double[] myList = {1.2,1.5,6.8,7.9};
        double total = 0;
        double max = myList[0];
        
        for (double number : myList) {
            
            if(max < number);
            max = number;
            
            total = total + number;
        }
        System.out.println("Toplam" + total);
        System.out.println("En büyük sayi " + max);
        
        
    }
    
}
