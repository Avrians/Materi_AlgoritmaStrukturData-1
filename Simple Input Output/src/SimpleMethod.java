import java.util.Scanner;

public class SimpleMethod {

    public static void CetakJudul(){
        String Title01;
        String Title02;
        Title01 = "Mencetak Judul dalam method";
        Title02 = "Method cetakjudul terpanggil dari public void main";
        System.out.println("\n"+Title01);
        System.out.println(Title02);
    }

    public static void HitungLuasPersegi() {
        double Panjang;
        double Lebar;
        double Luas;
        Panjang = 10;
        Lebar = 15;
        Luas = Panjang * Lebar;
        System.out.println("\n Luas Persegi Panjang = "+Luas);
    }

    private static void HitungLuasLingkaran(){
        Scanner inputUser = new Scanner(System.in);
        double jarijari;
        double LuasLingkaran;
        System.out.println("\n Masukan Jarijari = ");
        jarijari = inputUser.nextDouble();
        LuasLingkaran = Math.PI* jarijari*jarijari;
        System.out.println("Luas Lingkaran = " + LuasLingkaran);
    }

    public static void main(String[] args) {
        String Judul01;
        String Judul02;

        Judul01 = "cetak kalimat tanpa method";
        Judul02 = "Ini adalah contoh untuk mencetak judul tanpa method";
        System.out.println(Judul01);
        System.out.println(Judul02);

        // call method 'cetakjudul' at line 3
        CetakJudul();

        // Menghitung luas persegi panjang dengan memanggil method hitungluaspersegi
        HitungLuasPersegi();

        // menghitung luas lingkaran dengan memanggil method hitung luasLIngkaran
        HitungLuasLingkaran();

    }


}
