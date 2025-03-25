class Dosen extends Karyawan {
    private Fakultas fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas, Universitas universitas) {
        super(nama, email, NIP, masaKerja, universitas);
        this.fakultas = fakultas;
    }

    public int hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * fakultas.getGajiPokok() / 100);
    }

    public void printInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Email       : " + email);
        System.out.println("Universitas : " + universitas.getNama());
        System.out.println("NIP         : " + NIP);
        System.out.println("Masa Kerja  : " + masaKerja + " tahun");
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.printf("Gaji        : Rp %,d,00\n", hitungGaji());
    }
}
