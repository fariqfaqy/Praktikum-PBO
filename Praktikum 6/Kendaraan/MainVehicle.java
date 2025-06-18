public class MainVehicle {
    public static void hitungSewa(Vehicle v, int hari) {
        v.cetakInfo();
        System.out.println("Total sewa untuk " + hari + " hari: " + v.hitungSewa(hari));
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota Avanza", 300000);
        Vehicle v2 = new Truck("Mitsubishi Fuso", 500000);
        Vehicle v3 = new Motorcycle("Yamaha NMax", 150000);

        hitungSewa(v1, 3);
        hitungSewa(v2, 2);
        hitungSewa(v3, 4);
    }
}
