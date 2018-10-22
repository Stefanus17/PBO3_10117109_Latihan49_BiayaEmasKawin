/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan49_biayaemaskawin;

/**
 *
 * @author Asus
 */
public class Emas {
    
    private double totalBerat;
    private int harga;

    public double getTotalBerat() {
        return totalBerat;
    }

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double perhitungan(){
        return harga*totalBerat;
    }
}
