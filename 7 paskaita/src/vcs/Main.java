package vcs;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\cb-vice\\Desktop\\Failas\\failas.txt");

        VcsUtils.println(file.toString());

        BufferedWriter bw = VcsUtils.newWriter(file.toString());

        bw.append(VcsUtils.NEW_LINE + "ketvirta");
        bw.flush();
        bw.close();


        BufferedReader br = VcsUtils.newReader(file.toString());

        String line;
        while ((line = br.readLine()) != null) {
            VcsUtils.println(line);
        }
        br.close();

    }
}