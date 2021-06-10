/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class SmartPhone extends Tokko {

    int Jumlahkamera;

    public void setHarga(int harga) {
        super.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setTotal(int total) {
        super.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setMerk(String merk) {
        super.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setjumlahKamera(int jumlahKamera) {
        this.Jumlahkamera = Jumlahkamera;
    }

    public int getjumlahKamera() {
        return Jumlahkamera;
    }

    public void Display() {
        System.out.println("<<<<<<<<<<<<<<Pembelian SmartPhone>>>>>>>>>>>>>>");
    }
}
