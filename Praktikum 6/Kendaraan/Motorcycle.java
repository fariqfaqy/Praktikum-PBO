public class Motorcycle extends Vehicle{
     public Motorcycle(String nama, int harga){
          super(nama, harga);
     }

     @Override
     public int hitungSewa(int lamaHari){
          return harga * lamaHari;
     }
}