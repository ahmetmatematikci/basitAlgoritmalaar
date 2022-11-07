/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basitAlistirmalar;

/**
 *
 * @author ahmet.kilic1
 */
public class DizidekiSayiyiBulma {
    public static void main(String[] args) {
        
        int[] sayilar = new int[]{1,8,3,624};
        int aranacak = 5;
        boolean varMi = false;
        
        for (int i : sayilar) {
            if (i== aranacak) {
                varMi = true;
            }
        }
        
        if (varMi) {
            System.out.println("Dizide sayı bulunmakta");
        } else {
        
            System.out.println("Böyle bir sayı dizide yok");
        }
    }
    
    
}
