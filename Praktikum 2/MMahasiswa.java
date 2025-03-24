public class MMahasiswa {
    public static void main(String[] args) {
        System.out.println("======================= Data Mahasiswa =======================");
        System.out.println();

        Mahasiswa mhs = new Mahasiswa("24060121120034", "Budi Santoso", "Teknik Informatika");

        Dosen dosen = new Dosen("123456789", "Dr. Andi", "Teknik Informatika");
        mhs.setDosenWali(dosen);

        Kendaraan kendaraan = new Kendaraan("H 1234 AB", "Motor");
        mhs.setKendaraan(kendaraan);

        MataKuliah matkul1 = new MataKuliah("IF101", "Pemrograman Berorientasi Objek", 3);
        MataKuliah matkul2 = new MataKuliah("IF102", "Struktur Data", 4);
        mhs.addMatKul(matkul1);
        mhs.addMatKul(matkul2);
        mhs.printDetailMhs();

        
    }
}
