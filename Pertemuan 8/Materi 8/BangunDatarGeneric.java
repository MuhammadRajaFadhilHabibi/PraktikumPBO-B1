public class BangunDatarGeneric<T1 extends Bangundatar> {
    private T1 bangunDatar;

    public void set(T1 tipebangunDatar){
        this.bangunDatar = tipebangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

//Kesimpulan
/*Penggantian huruf T dengan T1, T2, T1234, atau karakter lainnya tidak mempengaruhi cara kerja atau fungsionalitas kelas generik tersebut. 
Hal ini karena dalam deklarasi kelas generik, huruf tersebut hanya berfungsi sebagai parameter tipe placeholder yang menunjukkan bahwa kelas ini akan 
bekerja dengan tipe data tertentu yang akan ditentukan saat instansiasi. */