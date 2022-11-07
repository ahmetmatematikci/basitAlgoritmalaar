/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basitAlistirmalar;

/**
 *
 * @author ahmet.kilic1
 */
public class Diziler {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "ayşe";
        ogrenciler[2] = "fatma";
        ogrenciler[3] = "salih";
        
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------");
        
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
            
        }
        
        
    }
    
}
