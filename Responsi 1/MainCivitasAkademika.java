public class MainCivitasAkademika {
    public static void main(String[] args) {
        Universitas undip = new Universitas("Universitas Diponegoro");
        Fakultas fsm = new Fakultas("Fakultas Sains dan Matematika", 5000000, 6000000, undip);

        Mahasiswa mhs1 = new Mahasiswa("Fariq Faqy Rozzaqy", "faqy@email.com", "24060123130096", 4, fsm, undip);
        Mahasiswa mhs2 = new Mahasiswa("Budiono Siregar", "siregar@email.com", "24060123130123", 8, fsm, undip);

        Dosen dosen1 = new Dosen("Dr. Andi", "andi@email.com", "123456789", 5, fsm, undip);
        Dosen dosen2 = new Dosen("Dr. Suci Mutiara", "suci@email.com", "123432123", 2, fsm, undip);

        Tendik tendik = new Tendik("Agus Salim", "agus@email.com", "987654321", 7, undip);

        System.out.println("\n======================= Data Mahasiswa =======================");
        mhs1.printInfo();
        System.out.println("\n");
        mhs2.printInfo();

        System.out.println("\n======================= Data Dosen =======================");
        dosen1.printInfo();
        System.out.println("\n");
        dosen2.printInfo();

        System.out.println("\n======================= Data Tendik =======================");
        tendik.printInfo();
    }
}
