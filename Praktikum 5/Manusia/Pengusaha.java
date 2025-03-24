/* Nama File : Pengusaha.java
 * Deskripsi : Berisi atribut dan method dalam subclass Pengusaha
 * Pembuat : Fariq Faqy Rozzaqy / 24060123130096
 * Tanggal : Rabu, 19 Maret 2025
 */

class Pengusaha extends Manusia implements Pajak {
    private String nomorNPWP;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, int tglMulaiKerja, String alamat, double pendapatan, String nomorNPWP) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nomorNPWP = nomorNPWP;
        counterPengusaha++;
    }

    public double hitungPajak() {
        return pendapatan * 0.15;
    }

    public int hitungMasaKerja() {
        return 2025 - tglMulaiKerja;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}