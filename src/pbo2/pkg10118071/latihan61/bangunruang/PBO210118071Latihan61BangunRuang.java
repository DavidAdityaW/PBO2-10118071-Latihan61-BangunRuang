/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan61.bangunruang;

/**
*
* @author 
* NAMA              : David Aditya Winarto
* KELAS             : PBO2
* NIM               : 10118071
* Deskripsi Program : Program ini berisi program untuk menghitung
*                     volume bangun ruang bola, tabung, dan kerucut
*                     dengan konsep abstraksi
* 
*/
public class PBO210118071Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bola b = new Bola();
        b.setJari(7);

        System.out.println("Hasil V = " + String.format("%.02f", b.hitungVolume()));

        Tabung t = new Tabung();
        t.setJari(10);
        t.setTinggi(21);

        System.out.println("Hasil V = " + t.hitungVolume());
        
        Kerucut k = new Kerucut();
        k.setJari(14);
        k.setTinggi(9);

        System.out.println("Hasil V = " + String.format("%.02f", k.hitungVolume()));
        
    }
    
}
