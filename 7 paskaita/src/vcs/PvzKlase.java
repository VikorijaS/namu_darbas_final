package vcs;

import java.io.File;

/**
 * Created by cb-vice on 2016.10.21.
 */
public class PvzKlase<T> {

    private T reiksme;

    public  PvzKlase (T arg) {

        reiksme = arg;
    }

    public T getReiksme() {

        return reiksme;
    }
}
