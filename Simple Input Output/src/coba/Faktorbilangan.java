package coba;

import java.util.Scanner;

public class Faktorbilangan {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya : ");
        int tambah = 0;
        for (int z = 0;z<=nilai;z++){
            tambah++;
            if (nilai%tambah == 0) {
                System.out.println(tambah + " ");
            }
        }
    }
}
