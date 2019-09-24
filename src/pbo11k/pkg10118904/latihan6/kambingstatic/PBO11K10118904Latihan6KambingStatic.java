/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan6.kambingstatic;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk membuat variabel static
 */
public class PBO11K10118904Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamalia.jumlahKambing = 485000;
        System.out.println(KambingStatic.NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
