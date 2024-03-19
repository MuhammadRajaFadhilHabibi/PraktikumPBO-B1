import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}

/*Praktekkan : apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi 
metode abstrak yang ada pada kelas BangunDatar ? jelaskan !*/ 

/*jawab:  Kelas BujurSangkar harus membuat implementasi metode abstrak yang ada pada kelas BangunDatar 
karena kelas BujurSangkar merupakan child/ subclass yang dimana metode abstrak yang ada di superclass BangunDatar 
(hitungLuas) harus di implementasikan, apabila tidak di implementasikan maka akan terjadi kesalahan kompilasi*/
