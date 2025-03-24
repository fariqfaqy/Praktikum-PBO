/* Nama File : Manusia.java
 * Deskripsi : Berisi atribut dan method dalam subclass PNS
 * Pembuat : Fariq Faqy Rozzaqy / 24060123130096
 * Tanggal : Rabu, 19 Maret 2025
 */

class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, int tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public double hitungPajak() {
        return pendapatan * 0.10;
    }

    public int hitungMasaKerja() {
        return 2025 - tglMulaiKerja;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }
}