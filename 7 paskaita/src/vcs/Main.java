package vcs;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\cb-vice\\Desktop\\Failas\\failas.txt");

        VcsUtils.println(file.toString());

//
//            BufferedWriter bw = VcsUtils.newWriter(file.toString());
//            bw.append(VcsUtils.NEW_LINE + "ketvirta");
//            bw.flush();
//            bw.close();

        try{
        BufferedReader br = VcsUtils.newReader(file.toString()+ " bla");

        String line;
        while ((line = br.readLine()) != null) {
            VcsUtils.println(line);
        }
        br.close();

/** klaidos gaudomos nuo "vaiku iki tevu" pagal exeption'u hierarchija, nuo maziausio iki didziausio;
 *
 */
        } catch  (IOException ex) {
            VcsUtils.println(ex.getMessage());
            throw new RuntimeException("bandyk dar karta", ex);
        } catch (Exception ex)  {

        }
    }
}
