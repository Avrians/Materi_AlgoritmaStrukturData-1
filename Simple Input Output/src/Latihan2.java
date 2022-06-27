import java.util.Scanner;

public class Latihan2 {
    private static void CetakJudul() {
        String nim;
        String nama;
        String kelas;
        String project;

        nim = "NIM : 21090024";
        nama = "Nama : Avriansyah Bahtiar";
        kelas = "1A Teknik Informatika";
        project = "Belajar method";
        System.out.println("\n"+nim);
        System.out.println(nama);
        System.out.println(kelas);
        System.out.println(project);
    }
    private static void CetakKalimat(){
        String kalimat;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Kalimat = ");
        kalimat = inputUser.nextLine();
        System.out.println("\n Karakter dalam kolom adalah "+kalimat);

        for (int i = 0; i<kalimat.length();i++) {
            char[] ch = kalimat.toCharArray();
            System.out.println(ch[i]);
        }
        System.out.println("Jumlah dalam kolom adalah "+kalimat.length());
    }

    public static void main(String[] args) {
        CetakJudul();
        CetakKalimat();
    }
}
