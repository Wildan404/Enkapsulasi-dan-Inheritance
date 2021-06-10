/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class TV extends Tokko {
    String jenis;
    
    public void setharga(int harga){
        super.harga = harga;
    }
    public int getharga(){
        return harga;
    }
    public void setTotal(int total){
        super.total = total;
    }
    public int getTotal(){
        return total;
    }
    public void setMerk(String merk) {
        super.merk = merk;
    }

    public String getMerk() {
        return merk;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    } 
    public String getJenis(){
        return jenis;
    }
    public void Display(){
            System.out.println("<<<<<<<<<<<<<<Pembelian TV>>>>>>>>>>>>>>");
    }
    
}
