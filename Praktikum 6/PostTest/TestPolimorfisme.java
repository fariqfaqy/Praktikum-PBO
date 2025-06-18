
// File: TestPolimorfisme.java
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        Pegawai pegawai4 = new Manajer("Ronaldo");
        Pegawai pegawai5 = new Programmer("Zidane");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println();
        }
    }
}

//1. Jelaskan manfaat polimorfisme pada kasus ini.
//Jawab:
//  - Semua objek yang merupakan turunan dari Pegawai (seperti Programmer dan Manajer)
//    bisa disimpan dalam satu ArrayList<Pegawai>.
//  - Memungkinkan penambahan subclass baru tanpa perlu mengubah struktur atau logika utama program.
//  - Perulangan for-each cukup satu kali untuk menangani semua jenis objek, tanpa perlu
//    memeriksa tipe objek satu per satu.
//  - Memudahkan pengelolaan data dan membuat kode lebih sederhana, fleksibel, dan mudah dikembangkan.

//2. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5!
//   Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
//Jawab:
//Jika tanpa polimorfisme (inclusion), maka akan muncul beberapa masalah:
//  - Harus membuat daftar (list) terpisah untuk setiap jenis pegawai, misalnya daftar khusus untuk Programmer dan Manajer.
//  - Harus melakukan pengecekan tipe objek sebelum memanggil method yang sesuai.
//  - Struktur kode menjadi lebih panjang, rumit, dan sulit dipelihara.
//  - Menambah jenis pegawai baru akan memerlukan banyak perubahan di berbagai bagian program.
