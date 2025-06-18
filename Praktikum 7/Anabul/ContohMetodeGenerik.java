package Anabul;

/**
 *
 * @author fariq
 */
public class ContohMetodeGenerik {
    public <G extends Anabul> G fungsi (Datum<G> d) {
        return d.getIsi();
    }
}