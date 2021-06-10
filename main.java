/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tokko struk = new Tokko();

        struk.display();

        struk.setAdmin("Wildan Aji Firmansyah");

        System.out.println("kasir Admin : " + struk.getAdmin() + "      10/06/2021");
        System.out.println("");
        System.out.println("");
        System.out.println("=========================================");

        SmartPhone hp = new SmartPhone();

        hp.Display();

        hp.setMerk("HP Kentang");

        System.out.println("Merk                    : " + hp.getMerk());

        hp.setjumlahKamera(0);

        System.out.println("Jumlah Kamera Belakang  : " + hp.getjumlahKamera());

        hp.setTotal(1);

        System.out.println("Total Barang            : " + hp.getTotal());

        hp.setHarga(599000);

        System.out.println("Harga                   : Rp " + hp.getHarga());

        TV barang = new TV();

        barang.Display();

        barang.setMerk("Cahaya Ilahi");

        System.out.println("Merk                    : " + barang.getMerk());

        barang.setJenis("XDX15000 ver.OneWeek Broken");

        System.out.println("Jenis                   : " + barang.getJenis());

        barang.setTotal(1);

        System.out.println("Total Barang            : " + barang.getTotal());

        barang.setharga(600000);

        System.out.println("Harga                   : Rp " + barang.getharga());

        KipasAngin produk = new KipasAngin();

        produk.Display();

        produk.setMerk(" Kipas Pembangkit Listrik Tenaga Angin");

        System.out.println("Merk                    : " + produk.getMerk());

        produk.setUkuran(1000);

        System.out.println("Ukuran Diameter Kipas   : " + produk.getUkuran() + " meter");

        produk.setTotal(1);

        System.out.println("Total Barang            : " + produk);
        produk.setHarga(2000000);

        System.out.println("Harga                   : Rp " + produk.getHarga());

        //penutup
        System.out.println("================================================");
        System.out.println("         TERIMAKASIH TELAH BERBELANJA           ");
        System.out.println("   BARANG YANG DIBELI TIDAK DAPAT DIKEMBALIKAN  ");
        System.out.println("             No.Telp. 0820080882208             ");
        System.out.println("================================================");
    }

}
