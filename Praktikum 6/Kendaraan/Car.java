public class Car extends Vehicle{
     public Car(String nama, int harga){
          super(nama, harga);
     }

     @Override
     public int hitungSewa(int lamaHari){
          return (harga * lamaHari) + 50000;
     }
}
