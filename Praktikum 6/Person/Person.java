public class Person {
    private String name;

    public Person(String name) { this.name = name; }
    public boolean isAsleep(int hr) { return 22 < hr || 7 > hr; }
    public String toString()       { return name; }

    public void status(int hr) {
        if (this.isAsleep(hr))
            System.out.println("Now offline: " + this);
        else
            System.out.println("Now online: " + this);
    }
}


//1. Maka output yang didapat adalah: Now online: Sally
//2. Diskusikan bagaimana hasil tersebut didapatkan 
//   (hint: apakah “this” pada kelas Person dalam method status 
//    dieksekusi ketika compile time atau runtime)
//Jawab:
//Output "Now online: Sally" muncul karena:
//  - Variabel p bertipe Person, namun objek yang dibuat adalah dari kelas Student.
//  - Method status() dipanggil dari kelas Person karena itu yang tersedia pada tipe referensi.
//  - Di dalam status(), terdapat pemanggilan this.isAsleep(hr).
//  - Kata kunci this merujuk pada objek sebenarnya yang dibuat, yaitu Student.
//  - Karena method isAsleep telah dioverride di kelas Student, maka method milik Student-lah yang dijalankan.
//  - Student.isAsleep(1) akan mengembalikan false (karena 1 tidak di antara 3 dan 7).
//  - Maka program mengeksekusi: System.out.println("Now online: " + this);
//  - Nilai this dalam toString() akan mengembalikan "Sally", jadi hasil akhirnya adalah:
//    "Now online: Sally"