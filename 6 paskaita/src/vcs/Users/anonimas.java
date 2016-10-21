package vcs.Users;

import vcs.interfeisai.User;

/**
 * Created by cb-vice on 2016.10.20.
 */
public class anonimas implements User{


    @Override
    public String getName() {
        return "Anonimas";
    }

    @Override
    public String getLastName() {
        return "Anonimas";
    }

    @Override
    public String getEmail() {
        return null;
    }
}
