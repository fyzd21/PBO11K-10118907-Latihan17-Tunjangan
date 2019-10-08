/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan17.tunjangan;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan mengjitung tunjangan
 * 
 */
public class PBO11K10118907Latihan17Tunjangan {
    public static void main(String[] args) {
        double gaji2, total, tunjangan = 0 ;
        
        System.out.print("Berapa gaji pokok Anda perbulan? Rp");
        Scanner scanner = new Scanner(System.in);
        String gaji = scanner.next();
        
        gaji2 = parseInt(gaji);
        
        System.out.print("Status Anda (Menikah/belum) ? ");
        Scanner scanner2 = new Scanner(System.in);
        String status = scanner2.next();
        
        if("menikah".equals(status.toLowerCase()))
            tunjangan = 0.35 * gaji2;
        
        total = gaji2 + tunjangan;
        System.out.println("\nGaji pokok: Rp"+gaji2);
        System.out.println("Tunjangan: Rp"+tunjangan);
        System.out.println("Total: Rp"+total);
        
        System.out.println("\nDeveloped by : Yazid");
        
    }
}
