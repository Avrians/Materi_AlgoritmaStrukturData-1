import java.util.Scanner;

public class Exercise {
    private static boolean GanjilGenap (int number) {

        if (number%2==0) {
            return true;
        } else {
            return false;
        }
    }

    private static void ShowMe(int angka) {
        boolean myGenap;
        myGenap  = GanjilGenap(angka);
        if (myGenap){
            System.out.println(angka + " Bilangan Genap");
        } else {
            System.out.println(angka + " Bilangan Ganjil");
        }
    }

    private static void PleaseInput() {
        Scanner inputUser = new Scanner(System.in);
        try {
            System.out.print("Masukan nilai = ");
            int number = inputUser.nextInt();
            ShowMe(number);
        } finally {
            inputUser.close();
        }
    }

    public static void main(String[] args) {
        PleaseInput();
    }
}
