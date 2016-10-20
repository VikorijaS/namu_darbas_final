package vcs;

import vcs.Daiktai.AbstractDaiktas;
import vcs.Daiktai.Daiktas;
import vcs.Daiktai.Zaislas;
import vcs.Users.AbstractUser;
import vcs.Users.Tomas;
import vcs.interfeisai.User;

import javax.jws.soap.SOAPBinding;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        User tomas1 = new Tomas("pavarde1","tomas@email1.lt");
        Tomas tomas2 = new Tomas("pavarde2","tomas@email2.lt");
        AbstractUser tomas3 = new Tomas ("pavarde3", "tomas@email3.lt");
        Zaislas zaislas = new Zaislas ("pliusinis meskinas");
        VcsUtils.println(zaislas.getPerId());

        if (tomas2 instanceof AbstractUser) ;
        {
            VcsUtils.println("tomas2 yra Abstraktus Useris");

        }

        if (tomas3 instanceof AbstractUser) ;
        {
            VcsUtils.println("tomas3 yra Abstraktus Useris");

        }
        if (tomas1 instanceof AbstractUser) ;
        {
            VcsUtils.println("tomas1 yra Abstraktus Useris");

        }


        if (tomas2 instanceof User) ;
        {
            VcsUtils.println("tomas2 yra Useris");

        }
        if (tomas2 instanceof Object) ;
        {
            VcsUtils.println("tomas2 yra Object'as");


        }
        if (tomas1 instanceof User) ;
        {
            VcsUtils.println("tomas1 yra Useris");

        }
        if (tomas1 instanceof Object) ;
        {
            VcsUtils.println("tomas1 yra Object'as");

        }
    }
}