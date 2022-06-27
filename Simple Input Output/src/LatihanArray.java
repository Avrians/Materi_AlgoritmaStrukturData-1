import java.util.Scanner;

public class LatihanArray {

    private static void inputNama() {
        Scanner input=new Scanner(System.in);
        String namaMhs[]=new String[10];

        for(int i=0;i<namaMhs.length;i++) {
            System.out.print("Masukan nama mahasiswa ke "+(i+1)+" : ");
            namaMhs[i]=input.next();
        }

        System.out.println("\nNama-nama mahasiswa yang dimasukan");
        for(int i=0;i<namaMhs.length;i++) {
            System.out.println((i+1)+". "+namaMhs[i]);
        }
    }
    public static void main(String[] args) {
        inputNama();
    }
}
