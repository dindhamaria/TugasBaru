package com.company;

public class Makanan {

    private String namaKue;
    private String hargaKue;
    private String jenisKue;
    private Pemilik Pemiliktoko;

    public Makanan(String namaKue, String hargaKue, String jenisKue, Pemilik pemiliktoko) {
        this.namaKue = namaKue;
        this.hargaKue = hargaKue;
        this.jenisKue = jenisKue;
        Pemiliktoko = pemiliktoko;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public void setNamaKue(String namaKue) {
        this.namaKue = namaKue;
    }

    public String getHargaKue() {
        return hargaKue;
    }

    public void setHargaKue(String hargaKue) {
        this.hargaKue = hargaKue;
    }

    public String getJenisKue() {
        return jenisKue;
    }

    public void setJenisKue(String jenisKue) {
        this.jenisKue = jenisKue;
    }

    public Pemilik getPemiliktoko() {
        return Pemiliktoko;
    }

    public void setPemiliktoko(Pemilik pemiliktoko) {
        Pemiliktoko = pemiliktoko;
    }

    @Override
    public String toString() {
        return "Makanan{" +
                "namaKue='" + namaKue + '\'' +
                ", hargaKue='" + hargaKue + '\'' +
                ", jenisKue='" + jenisKue + '\'' +
                ", Pemiliktoko=" + Pemiliktoko +
                '}';
    }

}