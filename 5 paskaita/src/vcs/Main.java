package vcs;

import vcs.Uzduotis.User;

public class Main {

    public static void main(String[] args) {

        User useris = new User("vardauskas","pavardauskas");

        VcsUtils.println((useris).toString());

    }
}
