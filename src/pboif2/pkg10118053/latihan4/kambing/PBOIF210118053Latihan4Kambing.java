/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan4.kambing;

/**
 *
 * @author 
 * NAMA : Kevin Alvian
 * KELAS : IF2
 * NIM : 10118053
 */
public class PBOIF210118053Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        
        System.out.println("Jumlah Kambing setelah ditambah: " +
                         jumlahKambing);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210118053Latihan4Kambing kambingJantan = new PBOIF210118053Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
