public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }
}
