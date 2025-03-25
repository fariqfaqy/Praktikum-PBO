class Tendik extends Karyawan {
    private static final int GAJI_POKOK = 4000000;

    public Tendik(String nama, String email, String NIP, int masaKerja, Universitas universitas) {
        super(nama, email, NIP, masaKerja, universitas);
    }

    public int hitungGaji() {
        return GAJI_POKOK + (masaKerja * GAJI_POKOK / 100);
    }

    public void printInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Email       : " + email);
        System.out.println("Universitas : " + universitas.getNama());
        System.out.println("NIP         : " + NIP);
        System.out.println("Masa Kerja  : " + masaKerja + " tahun");
        System.out.printf("Gaji        : Rp %,d,00\n", hitungGaji());
    }
}