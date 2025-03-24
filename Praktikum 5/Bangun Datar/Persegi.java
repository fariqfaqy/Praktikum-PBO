public class Persegi extends BangunDatar implements IResize {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    
    @Override
    public void zoomIn(double factor) {
        sisi *= factor;
    }
    
    @Override
    public void zoomOut(double factor) {
        sisi /= factor;
    }
}