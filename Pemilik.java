package com.company;

/**
 * Created by dindha on 6/9/2015.
 */
public class Pemilik {

    private String namaToko;
    private String alamatToko;
    private String notelpToko;

    public Pemilik(String namaToko, String alamatToko, String notelpToko) {
        this.namaToko = namaToko;
        this.alamatToko = alamatToko;
        this.notelpToko = notelpToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }

    public String getNotelpToko() {
        return notelpToko;
    }

    public void setNotelpToko(String notelpToko) {
        this.notelpToko = notelpToko;
    }

    @Override
    public String toString() {
        return "Pemilik { " +
                "\n Nama Toko ='" + namaToko  +
                "\n Alamat Toko ='" + alamatToko +
                "\n No.Telp Toko =" + notelpToko;
    }
}