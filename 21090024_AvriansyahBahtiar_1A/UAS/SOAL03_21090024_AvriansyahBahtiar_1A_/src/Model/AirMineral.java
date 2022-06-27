package Model;

public class AirMineral {
    private int Produksi;
    private int ukuran;
    private String merk;

    public AirMineral(int jumlahproduksi, int ukuranKemasan, String brand) {
        this.Produksi = jumlahproduksi;
        this.ukuran = ukuranKemasan;
        this.merk = brand;
    }


    public void PrintAirMineral() {
        System.out.println("JenisKemasan "+merk+"\nJumlah Produksi "+Produksi+"\nUkuran Kemasan "+ukuran+"\n");
    }
}
