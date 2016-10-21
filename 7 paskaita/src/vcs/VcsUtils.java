package vcs;

import java.io.*;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Klase skirta pagalbiniams metodams
 */
public class VcsUtils {

    private static Scanner scan = new Scanner(System.in);

    private Scanner newScanner() {
        return new Scanner(System.in);
    }


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
     *
     * @return perskaityta zodi
     */
    public static String inputWord() {
        return scan.next();
    }

    /**
     * perskaito eilute ivesta per cmd
     *
     * @return perskaityta eilute
     */
    public static String inputLine() {
        return scan.nextLine();
    }

    /**
     * perskaito integeri(sveika skaiciu) ivesta per cmd
     *
     * @return perskaityta integeri
     */
    public static int inputInt() {
        return scan.nextInt();
    }

    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final  String NEW_LINE = System.lineSeparator();

    /**
     * Metodas failo rederiui gauti
     * @param file Failo pavadinimas su keliu iki jo (path)
     * @return
     * @throws IOException
     */

    public static BufferedReader newReader(String file) throws IOException {

        File fl = new File(file);
        FileInputStream fis = new FileInputStream(fl);
        InputStreamReader isr = new InputStreamReader(fis, VcsUtils.UTF_8);
        return new BufferedReader(isr);
    }

    public static BufferedWriter newWriter (String file) throws IOException {

        File fl1 = new File (file);
        FileOutputStream fos = new FileOutputStream(fl1);
        OutputStreamWriter osw = new OutputStreamWriter(fos, VcsUtils.UTF_8);
        return new BufferedWriter(osw);
    }
}


