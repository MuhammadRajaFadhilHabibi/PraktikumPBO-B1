package org.bangundatar;

import org.poligon.poligon;

public class Segitiga extends poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return alas * tinggi / 2;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga berisi " + this.getJumlahSisi());
    }
}
