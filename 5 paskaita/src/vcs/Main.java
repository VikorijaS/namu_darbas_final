package vcs;

import vcs.Uzduotis.User;
import vcs.paketas.PaketoKlase;
import vcs.users.Linas;
import vcs.users.Viktorija;
import vcs.users.Zenklas;

public class Main {

    public static void main(String[] args) {

        Zenklas zenklas = new Zenklas("Snickers");
        User linas = new Linas ("raudona");
        User viktorija = new Viktorija("moto");
        User useris = new User("vardauskas","pavardauskas");
        User pk = new Viktorija("tekstas");

        if (viktorija instanceof Viktorija) {

            VcsUtils.println("Viktorija valio");
            Viktorija tikraiVik = (Viktorija)viktorija;
            VcsUtils.println(tikraiVik.getHobis());
        }

        if (zenklas instanceof User){
            VcsUtils.println("Valio Object");
        }

        VcsUtils.println((useris).toString());

        VcsUtils.println((viktorija).toString());

        VcsUtils.println((linas).toString());
        VcsUtils.println((zenklas).toString());
    }
}
