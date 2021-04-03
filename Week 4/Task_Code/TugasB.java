import org.apache.commons.lang3.StringUtils;

public class TugasB {

    public void outputTugasBMinggu4(){

        System.out.println("This is task B :");
        System.out.println();

        int angkaFor = 1, angkaWhile = 1;

        System.out.println(StringUtils.center("\"For\" Loop:", 30));
        System.out.println("Bilangan kelipatan 2 (1 - 100) ");
        System.out.println(StringUtils.rightPad( "=", 30, "="));
        
        int newResult = 0;
        for (int i = x; i < 100; i++) {
            newResult = x * 2;
            If (x < 100) {
            System.out.print(angkaFor*2 + " ");
         }
            x = newResult ;
        }

        System.out.println();
        System.out.println();

        System.out.println(StringUtils.center("\"DO WHILE\" Loop :", 30));
        System.out.println("Bilangan kelipatan 2 (1 - 100) ");
        System.out.println(StringUtils.rightPad( "=", 30, "="));
        do {
            int x = angkaWhile * 2;
            System.out.print(x + " ");
            angkaWhile = x;
        } while (angkaWhile <= 50);
    }

}
