import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {

            System.out.println(StringUtils.rightPad("+", 20, "-") + "+");
            System.out.println(StringUtils.center("Available Menus :", 20));
            System.out.println("A. Tugas A Minggu 4");
            System.out.println("B. Tugas B Minggu 4");
            System.out.println("C. Tugas C Minggu 4");
            System.out.println(StringUtils.rightPad("-", 20, "-"));

            System.out.println("Please enter the task code : ");
            String kode = scan.nextLine().toLowerCase();

            switch (kode) {
                case "a" :
                    TugasA tugas1 = new TugasA();
                    tugas1.outputTugasAMinggu4();
                    break;
                case "b":
                    TugasB tugas2 = new TugasB();
                    tugas2.outputTugasBMinggu4();
                    break;
                case "c":
                    TugasC tugas3 = new TugasC();
                    tugas3.outputTugasCMinggu4();
                    break;
                default:
                    System.out.println("Invalid Input");
            }

            System.out.println();
            System.out.println("Would you like to continue? (yes or no)");
            String s = scan.nextLine().toLowerCase();
            if (s.equals("no") || s.equals("n") ) {
                stop = true;
            } else {
                if (!s.equals("yes") && !s.equals("y")) {
                    System.out.println("Please answer with yes or no");
                }
            }
        }
    }
}




