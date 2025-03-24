public class BangunDatar {
    private String warna;
    private String border;
    private int jmlSisi;
    
    public BangunDatar() {
        this.warna = "Default";
        this.border = "Default";
    }
    
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }
    
    public int getJmlSisi() {
        return jmlSisi;
    }
    
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    
    public void printInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        System.out.println("Jumlah Sisi: " + jmlSisi);
    }
}