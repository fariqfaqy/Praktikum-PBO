class Tendik extends Pegawai {
    private String bidang;
    private int bup = 55;

    public Tendik(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public int hitungTunjangan() {
        return (int) (0.01 * hitungMasaKerja() * gajiPokok);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: " + formatRupiah(hitungTunjangan()));
    }
}
