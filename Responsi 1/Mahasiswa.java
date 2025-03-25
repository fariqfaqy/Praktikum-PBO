class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas, Universitas universitas) {
        super(nama, email, universitas);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    public void printInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Email       : " + email);
        System.out.println("Universitas : " + universitas.getNama());
        System.out.println("NIM         : " + NIM);
        System.out.println("Semester    : " + semester);
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.printf("UKT         : Rp %,d,00\n", (int) hitungUKT());
    }
}
