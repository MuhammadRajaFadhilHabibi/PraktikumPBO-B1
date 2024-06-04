interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args){
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        //Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}

/*Compile dan jalankan kode tersebut ! Dapatkah anda membedakan antara bagamana 
diskonLebaran dan diskonBiasa diimplementasikan ?  */

/*diskonLebaran:
Penggunaan Lambda (Single-line expression): Ekspresi lambda ini sangat sederhana dan langsung mengembalikan nilai tanpa blok statement. 
Ini tidak menggunakan kurung kurawal {} dan secara otomatis mengembalikan hasil dari ekspresi tersebut. Kode: (harga) -> harga - (harga * 0.4).
cocok digunakan ketika ekspresi lambda hanya terdiri dari satu baris perintah.

diskonBiasa:
Penggunaan Lambda (Block expression): Dalam implementasi ini, ekspresi lambda memakai blok dengan kurung kurawal {}, 
yang berarti bisa menambahkan lebih dari satu pernyataan di dalamnya. Meskipun dalam kasus ini hanya satu baris perintah, 
menggunakan blok memungkinkan Anda menambahkan logika yang lebih kompleks jika diperlukan, seperti kondisional atau loop. 
Kode: (harga) -> { return harga - (harga * 0.1); }.Implementasi ini lebih fleksibel jika perlu menambahkan lebih banyak operasi atau logika. */