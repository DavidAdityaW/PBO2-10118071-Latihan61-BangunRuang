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
public class Kerucut extends BangunRuang {
    
     private double jari;
    private double tinggi;
    private double volume;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return volume = 3.14*(jari*jari)*tinggi*1/3; //V = 1/3*phi*r*r*t
    }
    
}
