import java.util.Scanner;

public class BilanganPrima {
    private static void CetakJudul() {
        String nim;
        String nama;
        String kelas;
        String tugas;
        String garis;

        nim = "NIM : 21090024";
        nama = "Nama : Avriansyah Bahtiar";
        kelas = "Kelas : 1 A Teknik Informatika";
        tugas = "Tugas : Program Bilangan Prima";
        garis = "============================";

        System.out.println(nim);
        System.out.println(nama);
        System.out.println(kelas);
        System.out.println(tugas);
        System.out.println(garis + "\n");
    }
    private static void CetakPrima(){
        Scanner inputUser = new Scanner(System.in);
        int bilangan;
        int cek;
        cek = 0;
        System.out.print("Masukan angka = ");
        bilangan = inputUser.nextInt();
        for (int i = 2 ; i <= bilangan; i++) {
            if (bilangan%i==0) {
                cek++;
            }
        }

        if (cek==1) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
    }

    public static void main(String[] args) {
        CetakJudul();
        CetakPrima();
    }
}
