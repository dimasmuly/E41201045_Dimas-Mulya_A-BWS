import org.apache.commons.lang3.StringUtils;

public class TugasB {

    public void outputTugasBMinggu4(){

        System.out.println("This is task B :");
        System.out.println();

        int angkaFor = 1, angkaWhile = 1;

        System.out.println(StringUtils.center("\"For\" Loop:", 30));
        System.out.println("Bilangan kelipatan 2 (1 - 100) ");
        System.out.println(StringUtils.rightPad( "=", 30, "="));
        for (int i = 0; i < 50; i++) {
            System.out.print(angkaFor*2 + " ");
            angkaFor++;
        }

        System.out.println();
        System.out.println();

        System.out.println(StringUtils.center("\"DO WHILE\" Loop :", 30));
        System.out.println("Bilangan kelipatan 2 (1 - 100) ");
        System.out.println(StringUtils.rightPad( "=", 30, "="));
        do {
            System.out.print(angkaWhile*2 + " ");
            angkaWhile++;
        } while (angkaWhile <= 50);
    }

}
