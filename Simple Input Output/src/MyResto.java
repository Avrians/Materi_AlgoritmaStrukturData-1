
import java.util.Scanner;


public class MyResto{
    public static String[] MyCart = new String[6];

    private static void Load_Menu(){
        String MenuMakanan = "1. Nasi Putih\n2. Sayur Asem\n3.Ayam Goreng\n4.Pecak Lele\n5.Tempe Goreng\n6. Ayam Geprek \n";
        String MenuMinuman = "7. Teh Tawar\n8. Es Teh Manis\n9. Es Jeruk";
        Scanner myInput = new Scanner(System.in);
        char pilih='a';
        int loop = 0;
        do{
            System.out.println("\nMENU MAKANAN");
            System.out.println("-------------------");
            System.out.println(MenuMakanan + "\n");
            System.out.println("MENU  MINUMAN");
            System.out.println("-------------------");
            System.out.println(MenuMinuman);

            System.out.print("\nPilihan Anda ( tekan 'x' untuk mencetak Order / Keluar ) = ");
            pilih = myInput.next().charAt(0);

            AddToCart(pilih,loop);
            loop++;

        }while(pilih!='x');

        printOrder(MyCart);
    }
    private static void AddToCart(char order, int index) {
        String pilihanMakanana = "";
        switch (order) {
            case '1' :
                pilihanMakanana=  "Nasi Putih";
                break;
            case '2' :
                pilihanMakanana = "Sayur Asem";
                break;
            case '3':
                pilihanMakanana = "Ayam Goreng";
                break;
            case  '4':
                pilihanMakanana = "Pecak Lele";
                break;
            case '5' :
                pilihanMakanana = "Tempe Goreng";
                break;
            case '6' :
                pilihanMakanana = "6. Ayam Geprek";
                break;
            case '7':
                pilihanMakanana = "Teh Tawar";
                break;
            case  '8':
                pilihanMakanana = "Es Teh Manis";
                break;
            case  '9':
                pilihanMakanana = "Es Jeruk";
                break;
        }
            MyCart[index] = pilihanMakanana;
    }
    private static void printOrder(String[] keranjang) {
        System.out.println("\n Pesanan Anda Adalah :");
        for (int i=0;i<keranjang.length;i++) {
            System.out.println(keranjang[i]);
        }
    }

    public static void main(String[] args) {
        Load_Menu();
    }
}
