import Model.BumbuKuning;

public class bumbuMasakan {
    public static void main(String[] args) throws InterruptedException {

        BumbuKuning SotoAyam = new BumbuKuning("500", "50 gram", "4 cm", "5 cm", "1 sdt", "1 buah jeruk nipis");
        System.out.print("Bumbu-bumbu Soto Ayam adalah = ");
        SotoAyam.printBumbu();
        SotoAyam.durasiMasak("Soto Ayam", 10);

        BumbuKuning KariAyam = new BumbuKuning();
        KariAyam.durasiMasak("Kari Ayam", 5);

    }
}
