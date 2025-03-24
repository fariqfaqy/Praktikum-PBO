public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public double getAbsis() {
        return absis;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }
}
