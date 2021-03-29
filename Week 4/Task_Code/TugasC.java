import java.util.Scanner;

public class TugasC {

    public void outputTugasCMinggu4() {

        System.out.println("This is Task C :");
        System.out.println();

        Scanner in = new Scanner(System.in);
        int i = 1;
        int nilai;
        double jumlah = 0;
        double rata = 0;
        int max = 0, min = 1000;

        System.out.println("Masukan banyaknya data nilai : ");
        nilai = in.nextInt();

        while (i <= nilai) {
            int jml = i + 1;
            int[] tampung = new int[jml];

            System.out.print("Masukan data ke-" + i + " : ");
            tampung[i] = in.nextInt();
            jumlah = tampung[i] + jumlah;
            if (tampung[i] > max) {
                max = tampung[i];
            }
            if ((tampung[i] < min) && (tampung[i] >= 1)) {
                min = tampung[i];
            }
            i++;
        }
        rata = jumlah / (i - 1);
        System.out.println("Total: " + (int)Math.round(jumlah));
        System.out.println("Rata - Rata : " + rata);
        System.out.println("Angka Terkecil: " + min);
        System.out.println("Angka Terbesar: " + max);
    }
}
