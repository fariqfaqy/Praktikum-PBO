public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul;
    private int jumlahMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50]; 
        this.jumlahMatKul = 0;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah matKul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = matKul;
            jumlahMatKul++;
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum ada"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getJenis() + " - " + kendaraan.getNoPlat() : "Tidak memiliki"));

        System.out.println("Mata Kuliah yang Diambil:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
        }
        System.out.println("Total SKS: " + getJumlahSKS());
    }
}
