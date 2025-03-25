class Fakultas {
    private String nama;
    private int tarifUKT;
    private int gajiPokok;
    private Universitas universitas;

    public Fakultas(String nama, int tarifUKT, int gajiPokok, Universitas universitas) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
        this.universitas = universitas;
    }

    public String getNama() {
        return nama;
    }
    public int getTarifUKT() {
        return tarifUKT;
    }
    public int getGajiPokok() {
        return gajiPokok;
    }
    public String getNamaUniversitas() {
        return universitas.getNama();
    }
}