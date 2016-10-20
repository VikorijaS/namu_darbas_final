package vcs.Daiktai;

import java.util.Date;

/**
 * Created by cb-vice on 2016.10.20.
 */
public class Zaislas extends AbstractDaiktas {


    public Zaislas(String name) {
        super(name, new Date());
    }

    @Override
    public Date getPurchaseDate() {
        return null;
    }
}

