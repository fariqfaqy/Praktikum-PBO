class DosenTamu extends Dosen {
    private String nidk;
    private String tanggalAkhirKontrak;

    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String fakultas, String nidk, String tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public int hitungTunjangan() {
        return (int) (0.025 * gajiPokok);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + nidk);
        System.out.println("Tanggal Akhir Kontrak: " + tanggalAkhirKontrak);
        System.out.println("Tunjangan: " + formatRupiah(hitungTunjangan()));
    }
}