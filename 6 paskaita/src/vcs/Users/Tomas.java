package vcs.Users;

import vcs.interfeisai.User;

/**
 * Created by cb-vice on 2016.10.20.
 */
public class Tomas extends AbstractUser {


    public Tomas(String lastName, String email) {
        super("Tomas", lastName, email);
    }

    @Override
    public String describe() {
        return "Visi Tomai - Tomai: " + getLastName() + " " + email;
    }
}
