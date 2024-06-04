import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat objek Map dengan key tipe String dan value tipe String
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122141031", "Raja");
        mahasiswaMap.put("24060122140106", "Chandra");
        mahasiswaMap.put("24060122140161", "Demas");
        mahasiswaMap.put("24060122140170", "Qaynan");

        // Menggunakan ekspresi lambda untuk menampilkan setiap pasangan key-value pada Map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
