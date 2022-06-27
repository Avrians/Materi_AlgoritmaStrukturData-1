import java.util.Scanner;

public class LatKelasA {

    private static void CetaKKalimat(String[] kata) {
        int counter = 1;
        for (int i=0;i<kata.length;i++) {
            System.out.println(counter+". "+kata[i]);
            counter++;
        }

    }

    private static void inputNama() {
        Scanner input = new Scanner(System.in);
        String namaMhs[] = new String[10];

        int counter = 1;
        for (int i = 0;i<namaMhs.length;i++) {
                System.out.print("Masukan nama mahasiswa ke "+counter+" : ");
                namaMhs[i] = input.next();
                counter++;
        }

        System.out.println("\n Nama-nama mahasiswa yang dimasukan");
        CetaKKalimat(namaMhs);
    }

    public static void main(String[] args) {
        String[] Kalimat = {"A", "B", "C", "D"};
        CetaKKalimat(Kalimat);


        inputNama(); // buatlah method inputNama untuk Array 10 element untuk menampung
        // nama dari input user
    }


}
