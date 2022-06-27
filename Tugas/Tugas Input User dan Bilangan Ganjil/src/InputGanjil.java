import java.util.Scanner;

public class InputGanjil {
    public static void main(String[] args) {

        final String garis = "------------------------------";

        System.out.println("--------Program Menyeleksi Bilangan Ganjil-------");
        System.out.print("Ketentuan : \n");
        System.out.println("1. Data harus bilangan ganjil");
        System.out.print("2. Data < 1000 \n \n");

        Scanner masukanKu = new Scanner(System.in);
        System.out.println(garis);

        String keluaranKu;

        System.out.println("Masukan Angka : ");
        int myAngka =masukanKu.nextInt();

        System.out.println(garis);
        System.out.println("Hasil ");

        if (myAngka%2==0) {
            System.out.println("Maaf, Bilangan " +myAngka+ " bukan bilangan ganjil");
        }else {
            System.out.println("Benar, Bilangan " +myAngka+ " adalah bilangan ganjil");
        }

        if (myAngka < 1000) {
            System.out.println("Benar, Bilangan " +myAngka+ " kurang dari 1000");
        }else {
            System.out.println("Maaf, Bilangan " +myAngka+ " lebih dari 1000");
        }
    }
}
