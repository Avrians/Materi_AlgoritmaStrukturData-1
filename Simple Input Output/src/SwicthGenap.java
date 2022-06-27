public class SwicthGenap {
    public static void main(String[] args) {
        System.out.println("=====Program Perulangan Menggunakan For");
        System.out.println("Perulangan 1-50");

        System.out.println("Looping bilangan");


        for (int i = 1;i <= 50;i++) {
            if (i%2== 0) {
                System.out.println(i + " adalah bilangan genap");
            }else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}
