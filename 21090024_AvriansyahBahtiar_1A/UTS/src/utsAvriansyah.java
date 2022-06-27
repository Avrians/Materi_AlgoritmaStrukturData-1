import java.util.Scanner;

public class utsAvriansyah {
    public static void main(String[] args) {
        System.out.println("====Program Menghitung Keliling Lingkaran \n");
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai jari jari lingkaran = ");
        int jarijari;
        jarijari = inputUser.nextInt();

        double phi;
        phi = 3.14;
        double keliling;
        keliling = 2 * phi * jarijari;
        System.out.println("\nKeliling dari jari-jari lingkaran " + jarijari + " adalah " +keliling);
        if (keliling%2==0){
            System.out.println(keliling + " adalah bilangan genap");
        } else {
            System.out.println(keliling + " adalah bilangan ganjil");

        }
    }
}
