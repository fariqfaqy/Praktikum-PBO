class Pegawai {
    protected String nip;
    protected String nama;
    protected String tanggalLahir;
    protected String tmt;
    protected int gajiPokok;

    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        String[] tmtParts = tmt.split("-");
        int tahunTmt = Integer.parseInt(tmtParts[2]);
        int bulanTmt = Integer.parseInt(tmtParts[1]);

        int tahunSekarang = 2025;
        int bulanSekarang = 3;

        int masaKerjaTahun = tahunSekarang - tahunTmt;
        int masaKerjaBulan = bulanSekarang - bulanTmt;
        if (masaKerjaBulan < 0) {
            masaKerjaTahun--;
            masaKerjaBulan += 12;
        }
        return masaKerjaTahun;
    }
    public String formatRupiah(int amount) {
        return String.format("Rp%,d,00", amount).replace(',', '.');
    }
     public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + tmt);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Gaji Pokok: " + formatRupiah(gajiPokok));
    }
}