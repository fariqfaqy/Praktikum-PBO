class DosenTetap extends Dosen {
    private String nidn;
    private int bup = 65;

    public DosenTetap(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public int hitungTunjangan() {
        return (int) (0.02 * hitungMasaKerja() * gajiPokok);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + nidn);
        System.out.println("Tunjangan: " + formatRupiah(hitungTunjangan()));
    }
}