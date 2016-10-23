package lt.vcs;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        //----------------------------------


        VcsUtils.println("Kauliuku pokeris");
        VcsUtils.println("Zaidejas 1, iveskite savo varda");
        Player player1 = new Player(VcsUtils.inputWord());
        VcsUtils.println("Zaidejas 2, iveskite savo varda");
        Player player2 = new Player(VcsUtils.inputWord());

        player1.setCash(150);
        player2.setCash(150);

        boolean zaisti = true;
        while (zaisti) {
            Game newGame = new Game(player1, player2);
            newGame.start();
            VcsUtils.println("Ar norite zaisti toliau? (y - taip; n - ne)");
            String pasirinkimas = VcsUtils.inputWord();
            VcsUtils.println(player1.getStats());
            VcsUtils.println(player2.getStats());
            zaisti = "y".equalsIgnoreCase(pasirinkimas);
        }
    }
}
