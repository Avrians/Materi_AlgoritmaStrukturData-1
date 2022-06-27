import java.util.Scanner;

public class HitungLuasLingkaran {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai jari-jari lingkaran = ");
        int jarijari = inputUser.nextInt();

        double luas;
        luas = Math.PI * jarijari * jarijari;
        System.out.println("Luas lingkarannya adalah = " + luas);
    }
}
