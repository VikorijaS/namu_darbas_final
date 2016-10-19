package vcs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Klase skirta pagalbiniams metodams
 */
public class VcsUtils {

    private static Scanner scan = new Scanner(System.in);

    /**
     * Metodas isveda teksta i nauja eilute cmd lange su laiku priekyje
     */
    public static void println(String text) {
        Date data = new Date();
        String formatas = "'['HH:mm:ss:SSS']' ";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        System.out.println(sdf.format(data) + text);
    }

    /**
     * perskaito zodi ivesta per cmd
     * @return perskaityta zodi
     */
    public static String inputWord() {
        return scan.next();
    }

    /**
     * perskaito eilute ivesta per cmd
     * @return perskaityta eilute
     */
    public static String inputLine() {
        return scan.nextLine();
    }

    /**
     * perskaito integeri(sveika skaiciu) ivesta per cmd
     * @return perskaityta integeri
     */
    public static int inputInt() {
        return scan.nextInt();
    }

}
