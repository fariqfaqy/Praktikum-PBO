public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // Akan error karena abstract
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);
        
        System.out.println("Luas Persegi P1: " + P1.getLuas());
        System.out.println("Keliling Persegi P1: " + P1.getKeliling());
        System.out.println("Luas Lingkaran L1: " + L1.getLuas());
        System.out.println("Keliling Lingkaran L1: " + L1.getKeliling());
        
        System.out.println("Apakah P1 dan L1 memiliki luas yang sama? " + P1.isEqualLuas(L1));
        System.out.println("Apakah P1 dan L1 memiliki keliling yang sama? " + P1.isEqualKeliling(L1));
        
        // Uji Zoom
        P2.zoomIn(2);
        System.out.println("Luas Persegi P2 setelah zoomIn: " + P2.getLuas());
        L2.zoomOut(2);
        System.out.println("Luas Lingkaran L2 setelah zoomOut: " + L2.getLuas());
    }
}
