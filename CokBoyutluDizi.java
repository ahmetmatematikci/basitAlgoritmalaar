/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basitAlistirmalar;

/**
 *
 * @author ahmet.kilic1
 */
public class CokBoyutluDizi {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        
        sehirler[0][0] = "İStanbul";
        sehirler[0][1] = "adana";
        sehirler[0][2] = "mersin";
        sehirler[1][0] = "ankara";
        sehirler[1][1] = "marmara";
        sehirler[1][2] = "antep";
        sehirler[2][0] = "malatya";
        sehirler[2][1] = "mahalle";
        sehirler[2][2] = "kalp";
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("------------");
            
            for (int j = 0; j <=2; j++) {
                System.out.println(sehirler[i][j]);
                
            }
            
            
        }
        
        
        
    }
    
}
