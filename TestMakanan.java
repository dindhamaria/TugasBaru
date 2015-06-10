package com.company;

/**
 * Created by dindha on 6/9/2015.
 */
public class TestMakanan {
    public static void main (String[] args) {
        Pemilik Mochi = new Pemilik("Mochi Imut", "Jl.K.H. Yusuf Malang", "081937002576");
        System.out.println("Semua Data Toko : " + Mochi.toString());
        System.out.println("Nama Toko : " + Mochi.getNamaToko());
        System.out.println("Alamat Toko : " + Mochi.getAlamatToko());
        System.out.println("No.Telp Toko : " + Mochi.getNotelpToko()+"\n");
        Makanan Mochiaa = new Makanan("Mochiaa","7500","Kue Basah", Mochi);
        System.out.println("Semua Data Kue : " + Mochiaa.toString());
        System.out.println("Nama Kue : " + Mochiaa.getNamaKue());
        System.out.println("Harga Kue : " + Mochiaa.getHargaKue());
        System.out.println("Jenis Kue : " + Mochiaa.getJenisKue());
        System.out.println("Pemilik Toko : " + Mochiaa.getPemiliktoko());
    }
}
