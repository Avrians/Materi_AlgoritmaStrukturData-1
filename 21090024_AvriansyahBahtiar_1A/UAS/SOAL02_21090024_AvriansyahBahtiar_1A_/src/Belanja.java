import java.util.Scanner;

/* Soal No 2
    Nama    : Avriansyah Bahtiar
    Kelas   : 1A
    NIM     : 21090024
 */

class ArrayMethod {
    public static String[] KeranjangBelanja(String barang,int index){
        String tampung[] = new String[20];
        tampung[index] = barang;
        return tampung;
    }



    public static void main(String[] args) {
        String[] item_belanja = new String[5];
        Scanner inputUser = new Scanner(System.in);
        int counter = 0;
        for(int index=0;index<item_belanja.length;index++) {
            counter++;
            System.out.println("Item Belanja Ke " + counter + " adalah ");
            String item = inputUser.nextLine();
            item_belanja = KeranjangBelanja(item,index); // Buatlah Method KeranjangBelanja
        }
        counter = 0;
        for(String item : item_belanja){
            System.out.println("Item Ke " + counter + "adalah " + item + "Dalam Keranjang ");
        }
    }
}