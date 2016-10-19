package vcs;

import vcs.Uzduotis.User;
import vcs.paketas.PaketoKlase;
import vcs.users.Linas;
import vcs.users.Viktorija;

public class Main {

    public static void main(String[] args) {

        User linas = new Linas ("raudona");
        User viktorija = new Viktorija("moto");
        User useris = new User("vardauskas","pavardauskas");
        User pk = new Viktorija("tekstas");

        if (viktorija instanceof Viktorija) {

            VcsUtils.println("Viktorija valio");
            Viktorija tikraiVik = (Viktorija)viktorija;
            VcsUtils.println(tikraiVik.getHobis());
        }

        if (pk instanceof User){
            VcsUtils.println("Paketas valio");
        }

        VcsUtils.println((useris).toString());

        VcsUtils.println((viktorija).toString());

        VcsUtils.println((linas).toString());
    }
}
