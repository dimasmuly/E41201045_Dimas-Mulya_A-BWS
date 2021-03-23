package Week_2.Examples;

import java.util.Scanner;

public class Prak_Scanner {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Masukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        s1.close();

        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
