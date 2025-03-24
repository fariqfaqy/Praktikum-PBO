public class Lingkaran extends BangunDatar {
    private double radius;
    
    public Lingkaran() {
        super();
        this.radius = 0;
    }
    
    public Lingkaran(double radius, String warna, String border) {
        super(warna, border);
        this.radius = radius;
    }
    
    public double luas() {
        return Math.PI * radius * radius;
    }
    
    public void printInfo() {
        super.printInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Luas: " + luas());
    }
}