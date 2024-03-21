package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        bukuNovel bukuChandra = new bukuNovel("Chandra Mencari Kekasih", "Chandra Wijoyokusumo", "2024", "anime", 200, 100000);
        bukuChandra.view();
        bukuAkademik satutambahsatu = new bukuAkademik("satutambahsatuberapa", "QaynanGendut", "2024", "Matematika", 10, 50000);
        satutambahsatu.view();
    }
}