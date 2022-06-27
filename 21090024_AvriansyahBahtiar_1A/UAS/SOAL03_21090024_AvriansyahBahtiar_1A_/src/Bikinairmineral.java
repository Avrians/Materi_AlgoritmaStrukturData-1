import Model.AirMineral;

/* Soal No 2
    Nama    : Avriansyah Bahtiar
    Kelas   : 1A
    NIM     : 21090024
 */

public class Bikinairmineral {

    public static void main(String[] args) {

        AirMineral AIRKU = new AirMineral(10,600,"airku");
        AirMineral TOYABENING = new AirMineral(9,1000,"banyubening");
        AirMineral HAUS = new AirMineral(20,24,"haus");

        System.out.println("Informasi Produksi Hari ini");
        TOYABENING.PrintAirMineral();
        AIRKU.PrintAirMineral();
        HAUS.PrintAirMineral();
    }
}
