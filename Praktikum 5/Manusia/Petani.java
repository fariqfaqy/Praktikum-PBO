/* Nama File : Manusia.java
 * Deskripsi : Berisi atribut dan method dalam subclass Petani
 * Pembuat : Fariq Faqy Rozzaqy / 24060123130096
 * Tanggal : Rabu, 19 Maret 2025
 */

class Petani extends Manusia implements Pajak {
    private String daerah;
    private static int counterPetani = 0;

    public Petani(String nama, int tglMulaiKerja, String alamat, double pendapatan, String daerah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerah = daerah;
        counterPetani++;
    }

    public double hitungPajak() {
        return 0; 
    }

    public int hitungMasaKerja() {
        return 2025 - tglMulaiKerja;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }
}