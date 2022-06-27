package Model;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class BumbuKuning {
    private String Bumbu_BawangMerah;
    private String Bumbu_BawangPutih;
    private String Bumbu_Kunyit;
    private String Bumbu_lengkuas;
    private String Bumbu_Merica;
    private String Bumbu_Lain;


    public BumbuKuning(String bMerah , String bPutih, String kunyit, String lengkuas, String merica, String lainnya) {
        this.Bumbu_BawangMerah = bMerah;
        this.Bumbu_BawangPutih = bPutih;
        this.Bumbu_Kunyit = kunyit;
        this.Bumbu_lengkuas =lengkuas;
        this.Bumbu_Merica = merica;
        this.Bumbu_Lain = lainnya;
    }
    public BumbuKuning() {
        this.Bumbu_BawangMerah = "500 grm bMerah";
        this.Bumbu_BawangPutih = "100 grm bPutih";
        this.Bumbu_Kunyit = "3cm Kunyit";
        this.Bumbu_lengkuas = "4cm lengkuas";
        this.Bumbu_Merica = "5butir merica";
        this.Bumbu_Lain = "tidak ada";
    }

    public void printBumbu() {
        System.out.println(this.Bumbu_BawangMerah+" bawang merah, "+this.Bumbu_BawangPutih+" bawang putih, "+this.Bumbu_Kunyit+" kunyit, "+this.Bumbu_lengkuas+" lengkuas, "+this.Bumbu_Merica+" merica, "+this.Bumbu_Lain);
    }
    public void durasiMasak(String Makanan, int Durasi) throws InterruptedException {
        System.out.println("\nPesanan " +Makanan+" sedang diproses selama "+Durasi+" menit");
        System.out.println("Silahkan menunggu ... ");

        for (int counterTime = Durasi; counterTime > 0; counterTime--){
            System.out.println(counterTime);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Pesanan anda selesai, selamat menikmati \n");
    }

}
