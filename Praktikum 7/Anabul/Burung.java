package Anabul;

/**
 *
 * @author fariq
 */
public class Burung extends Anabul{
    public Burung(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Burung : Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Burung : Cuit");
    }
}