package vcs.users;

import vcs.Uzduotis.User;

/**
 * Created by cb-vice on 2016.10.19.
 */
public class Viktorija extends User {

    private String hobis;



    public Viktorija(String hobis) {
        super("Viktorija");
        this.hobis = hobis;


    }
    public String getHobis() {
        return hobis;
    }

    public void setHobis(String hobis) {
        this.hobis = hobis;
    }
        @Override
        public String toString() {
        return super.toString() + "megsta "  + this.hobis;
    }

}
