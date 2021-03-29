import java.util.Scanner;

public class TugasA {

    public void outputTugasAMinggu4() {
        System.out.println("This is Task A : ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int awalBilangan, batasBilangan;

        System.out.println("Masukkan bilangan awal : ");
        awalBilangan = sc.nextInt();

        System.out.println("Masukkan bilangan akhir : ");
        batasBilangan = sc.nextInt();

        for (int i = awalBilangan; i <= batasBilangan; i++) {
            System.out.print(i + " ");
        }
    }


}
