package Anabul;

/**
 *
 * @author fariq
 */
public class Anjing extends Anabul{
    public Anjing(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Anjing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Anjing : Guk-guk");
    }
}