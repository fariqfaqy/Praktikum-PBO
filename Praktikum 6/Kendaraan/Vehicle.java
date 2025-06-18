public class Vehicle{
     protected String nama;
     protected int harga;

     public Vehicle(String nama, int harga){
          this.nama = nama;
          this.harga = harga;
     }

     public int hitungSewa(int lamaHari){
          return harga * lamaHari;
     }

     public void cetakInfo(){
          System.out.println("Nama Kendaraan: " + nama);
          System.out.println("Harga per hari: " + harga);
     }
}