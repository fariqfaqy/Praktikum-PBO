public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super();
        setJmlSisi(4);
    }
    
    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
        setJmlSisi(4);
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}