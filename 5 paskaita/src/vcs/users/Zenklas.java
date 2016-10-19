package vcs.users;

import vcs.Uzduotis.User;

/**
 * Created by cb-vice on 2016.10.19.
 */
public class Zenklas extends User {

    private String prekinisZenklas;



    public Zenklas(String prekinisZenklas) {
        super("Zenklas");
        this.prekinisZenklas = prekinisZenklas;


    }
    public String getPrekinisZenklas() {
        return prekinisZenklas;
    }

    public void setPrekinisZenklas(String prekinisZenklas) {
        this.prekinisZenklas = prekinisZenklas;
    }
    @Override
    public String toString() {
        return super.toString() + "megstamiausias prekinis zenklas "  + this.prekinisZenklas;
    }

}

