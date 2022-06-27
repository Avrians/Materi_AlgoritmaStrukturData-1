import java.util.Scanner;

public class ReviewCourse {
    public static void main(String[] args) {
        // Tipe data primitive meliputi int, byte, float, double,char, boolean

        // deklarasi tipe data primitive pada variabel
        int angkaInteger;
        float angkaFloat;
        byte angkaByte;
        double angkaDouble;
        char hurufChar;
        boolean statusBoolean;

        // Assign value ke tipe data
        angkaInteger = 20;
        angkaFloat = 20f;
        angkaByte = 20;
        angkaDouble = 20;
        hurufChar = 'A';
        statusBoolean = true;

        // Cetak isi dari variables
        System.out.println("Angka Integer adalah = "+ angkaInteger);
        System.out.println("Angka Float adalah = "+ angkaFloat);
        System.out.println("Angka Byte adalah = "+ angkaByte);
        System.out.println("Angka Double adalah = "+ angkaDouble);
        System.out.println("Angka Char adalah = "+ hurufChar);
        System.out.println("Angka Boolean adalah = "+ statusBoolean);

        /* ----------------------------------------------------------------*/
        // Tipe data non primitive seperti string, scanner

        // deklarasi tipe data non primitive pada variabels
        String namaSaya;
        Scanner inputScanner;

        // assign value ke tipe data non primitive string
        namaSaya = "Pocoyo";

        // cetak isi variabel string namsaya
        System.out.println("Nama Saya Adalah = "+ namaSaya);

        // tipe data scanner digunakan untuk menunggu inputan dari User
        inputScanner = new Scanner(System.in);
        System.out.println("Masukan Angka = ");

        // Input dari user ditampung dalam variabel bertipe data primitive
        // Dalam kasus ini inputan user berupa angka ditampung dalam tipe data Integer
        int inputanAngka;
        inputanAngka = inputScanner.nextInt();

        //cetak isi dari variabel inputanangka yang diperoleh dari user
        System.out.println("Angka yang Anda Input Adalah = "+ inputanAngka);

        //  input dari user ditampung dalam variabel bertibe data non primitive string
        Scanner inputString;
        inputString = new Scanner(System.in);
        System.out.println("Masukan nama kamu = ");
        String namaKamu;
        namaKamu = inputString.nextLine();

        // cetak isi dari variable namakamu yang diperoleh dari User
        System.out.println("Nama Kamu Adalah = "+ namaKamu);


    }
}
