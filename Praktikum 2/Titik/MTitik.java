public class MTitik {
    public static void main(String[] args) {
        System.out.println("======================= Titik =======================");
        System.out.println();

        Titik t1 = new Titik();
        Titik t2 = new Titik(3, 4);
        System.out.println("Titik 1: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Titik 2: (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        t1.setAbsis(2);
        t1.setOrdinat(3);
        System.out.println("Setelah perubahan, Titik 1: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Jumlah objek Titik yang dibuat: " + Titik.getCounterTitik());
    }
}
