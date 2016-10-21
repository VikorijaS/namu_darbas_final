package vcs;

import java.awt.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\cb-vice\\Desktop\\Failas\\failas.txt");

        VcsUtils.println(file.toString());


        /**
         * castinimas yra kai viena kintamaji paverti kitos klases kintamuoju, prirasius klases pavadinima pries kintamaiji, kaip pvz su (File)kazkas;
         */

        PvzKlase <File> pvz = new PvzKlase<File>(file);
        Object kazkas = pvz.getReiksme();
        if (kazkas instanceof File){
            File tikraiFailas = (File)kazkas;
            tikraiFailas.exists();
        }

        List<Integer> listas = new ArrayList<>();
        for (int i = 1; 1 < 6; i++) {
            listas.add(i);
        }

//        int kurTrys = listas.indexOf(3);
        int kurTrys = listas.indexOf(3);
        Integer trys = listas.get(kurTrys);
        VcsUtils.println(trys.toString());


        /**
         * map'as, list'as su vienu objektiniu kintamuoju, o map'as turi du tokius parametrus, nusakantys rakta ir reiksme
         * for each metodas zemiau.
         * i map'o kolekcijas dedame put metoda
         * mapas saugo "raktus" set'e, reikmes "hastable"
         */

        Map<Integer, String> mapas = new HashMap<>();
        for (Integer i: listas){
            mapas.put(i, ""+i+"ys");
        }

        mapas.get(6);
        VcsUtils.println(mapas.get(6));
        mapas.containsKey(6);
        for (Integer raktas : mapas.keySet()){
            String reiksme = mapas.get(raktas);
        }
//
//            BufferedWriter bw = VcsUtils.newWriter(file.toString());
//            bw.append(VcsUtils.NEW_LINE + "ketvirta");
//            bw.flush();
//            bw.close();

        try{
        BufferedReader br = VcsUtils.newReader(file.toString());

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
    /**
     *     Collection set ir list, set kolekcijoje laikomas sarasas duomenu, kuri reiksme unikali, vienodu reiksmiu negalime ideti.
     *      List gali tureti dublikuotu reiksmiu. Kelis kartus naudoti
     *      Set - hash set, list ArrayList;
     *      hash - paremtas hashtable.
     */
