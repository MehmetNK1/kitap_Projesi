package hastane;

import java.util.Scanner;

public class TryCatches {
    static Scanner scan = new Scanner(System.in);

    public static String StringTryCatch() {
        String str = "";
        boolean flag = true;

        do {
            str = "";
            try {
                str = scan.nextLine();
                scan.nextLine();
                flag = false;
            } catch (Exception e) {
                System.out.println("Gecerli bir giris yapiniz.");
            }
        } while (flag);
        return str;
    }
}
