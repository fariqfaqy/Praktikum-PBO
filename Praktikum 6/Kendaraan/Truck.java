public class Truck extends Vehicle{
     public Truck(String nama, int harga){
          super(nama, harga);
     }

     @Override
     public int hitungSewa(int lamaHari){
          return (harga * lamaHari) + (10000 * lamaHari);
     }
}