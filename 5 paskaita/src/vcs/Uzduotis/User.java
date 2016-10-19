package vcs.Uzduotis;

/**
 * Created by cb-vice on 2016.10.19.
 */
public class User {
    private String vardas;
    private String pavarde;
    private final String klasesVardas;

    /**
     * User klase konstriuktoriuje
     * @param vardas vardas
     * @param pavarde pavarde
     */

    public User (String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klasesVardas = this.getClass().getName();



    }
    @Override

    public String toString(){
        String result = this.klasesVardas + ":" +
                " vardas - " + this.vardas +
                " pavarde - " + this.pavarde;
        return result;

    }

    public String getVardas() {

        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getKlasesVardas() {
        return klasesVardas;
    }


}
