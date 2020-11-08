/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan35.programtunjangan;

/**
 *
 * @author zulfi ihzam rahmat
 */
public class tunjangan {
    double tunjangan;
    double totalGaji;

     public void hitungTunjangan(double gajiPokok, String status){
         System.out.println("===Hasil Perhitungan Gaji===");
         System.out.println("Berapa Gaji Pokok anda perbulan : " + gajiPokok);
         
         //Tunjangan
         tunjangan = (status.equalsIgnoreCase("Menikah")) ? gajiPokok * 0.35 : 0;
        
         System.out.println("Tunjangan : Rp. " + tunjangan);
         
        //Total Gaji
         totalGaji = tunjangan + gajiPokok;
         System.out.println("Total Gaji : Rp. " +totalGaji);
     }
}
