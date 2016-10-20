package vcs.Daiktai;

import vcs.VcsUtils;
import vcs.interfeisai.VcsEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.awt.SystemColor.text;

/**
 * Created by cb-vice on 2016.10.20.
 */
public abstract class AbstractDaiktas extends VcsUtils implements Daiktas, VcsEntity {

    private String name;
    private Date purchaseDate;


    public AbstractDaiktas(String name, Date purchaseDate) {
        this.name = name;
        this.purchaseDate = purchaseDate;
    }


    public String getName() {
        return name;
    }

    public Date getDate() {
        return purchaseDate;
    }


    public String getPerId() {
        String formatas = "'['ss:mm:HH']' ";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        return purchaseDate + name;


    }
}


