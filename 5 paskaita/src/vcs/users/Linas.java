package vcs.users;

import vcs.Uzduotis.User;

/**
 * Created by cb-vice on 2016.10.19.
 */
public class Linas extends User {

    private String spalva;



    public Linas (String spalva) {
            super("Linas");
        this.spalva = spalva;


    }
    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }
    @Override
    public String toString() {
        return super.toString() + "megsta "  + this.spalva;
    }

}
