

public class MPegawai {
   public static void main(String[] args) {
        System.out.println("\n========================= Daftar Pegawai Universitas =========================\n");
        DosenTetap dosenTetap = new DosenTetap("954547548", "Andi", "05-05-1990", "01-01-2015", 5000000, "Fakultas Sains dan Matematika", "78647324");
        DosenTamu dosenTamu = new DosenTamu("123456789", "Budi", "10-03-1985", "15-06-2020", 4000000, "Fakultas Teknik", "789654", "31-12-2025");
        Tendik tendik = new Tendik("987654321", "Siti", "25-08-1980", "20-04-2010", 3500000, "Administrasi");
        
        System.out.println("Informasi Dosen Tetap:");
        dosenTetap.printInfo();
        
        System.out.println("\nInformasi Dosen Tamu:");
        dosenTamu.printInfo();
        
        System.out.println("\nInformasi Tendik:");
        tendik.printInfo();
    }
}