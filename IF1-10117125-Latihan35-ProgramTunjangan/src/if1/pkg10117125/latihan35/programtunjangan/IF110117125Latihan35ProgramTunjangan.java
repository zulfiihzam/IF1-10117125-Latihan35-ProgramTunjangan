/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan35.programtunjangan;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Zulfi Ihzam Rahmat
 * Kelas    : IF-1
 * NIM      : 10117125
 * Desktripsi Program : program ini berisi program yang menampilkan program
 * tunjangan pegawai
 */
public class IF110117125Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        
        tunjangan myTunjangan = new tunjangan();
        
        System.out.println("===Program Tunjangan===");
        System.out.print("Berapa Gaji Pokok Anda Sebulan? : Rp. ");  
        gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum) ? : ");
        status = scanner.next();
        System.out.println("");
        
        myTunjangan.hitungTunjangan(gajiPokok, status);
        System.out.println("Developed by : Zulfi Ihzam");
    }
    
}
