import java.util.Scanner;

public class inputArray {
    public static void main (String args[])
    {
        Scanner input=new Scanner(System.in);

        int kata[]=new int[9];

        for(int i=0;i<kata.length;i++)
        {
            System.out.print("Masukan angka ke "+(i+1)+" : ");
            kata [i]=input.nextInt();
        }

        System.out.println("Angka-angka yang dimasukan");
        for(int i=0;i<kata.length;i++)
        {
            System.out.println(kata[i]);
        }
    }
}