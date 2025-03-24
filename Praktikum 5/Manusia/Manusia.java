/* Nama File : Manusia.java
 * Deskripsi : Berisi atribut dan method dalam class Super Manusia
 * Pembuat : Fariq Faqy Rozzaqy / 24060123130096
 * Tanggal : Rabu, 19 Maret 2025
 */

public abstract class Manusia {
    protected String nama;
    protected int tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, int tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public abstract int hitungMasaKerja();

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + formatTanggalKerja(tglMulaiKerja));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + MManusia.formatRupiah(pendapatan) + "\n");
    }

    public static String formatTanggalKerja(int tahun) {
        return "01 April " + tahun;
    }
}


