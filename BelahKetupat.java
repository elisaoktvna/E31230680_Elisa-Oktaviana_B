/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelahKetupat;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class BelahKetupat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner belah = new Scanner (System.in);
        
        System.out.println("Masukkan nilai d1 = ");
        int d1 = belah.nextInt();
        
        System.out.println("Masukkan nilai d2 = ");
        int d2 = belah.nextInt();
        
        System.out.println("Masukkan nilai s = ");
        int s = belah.nextInt();
        
        double luas = 0.5 * d1 * d2;
        double keliling = 4 * s;
        
        System.out.println("Luas belah ketupat adalah = " + luas);
        System.out.println("Keliling belah ketupat adalah = " +keliling);
        
    }
    
}
