package Anabul;

/**
 *
 * @author fariq
 */
public class Kucing extends Anabul{
    public Kucing(String nama){
        setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Kucing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Kucing : Meong");
    }
}