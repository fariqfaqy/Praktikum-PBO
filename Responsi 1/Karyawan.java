class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja, Universitas universitas) {
        super(nama, email, universitas);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }
}