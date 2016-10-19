package vcs;

import vcs.Uzduotis.User;
import vcs.users.Viktorija;

public class Main {

    public static void main(String[] args) {

        Viktorija viktorija = new Viktorija("moto");

        User useris = new User("vardauskas","pavardauskas");

        VcsUtils.println((useris).toString());

        VcsUtils.println((viktorija).toString());
    }
}
