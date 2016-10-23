package lt.vcs;

/**
 * Zaidimo klase, reprezentuojanti viena zaidimo partija
 */
public class Game {

    /** pirmas zaidejas */
    private final Player p1;
    /** antras zaidejas */
    private final Player p2;

    private Player activePlayer;

    /**
     * zaidimo konstruktorius
     * @param p1 pirmas zaidejas
     * @param p2 antras zaidejas
     */
    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        activePlayer = p1;
    }

    /**
     * startuoja zaidima/partija
     */
    public void start() {
        VcsUtils.println(p1.getName() + " iveskite statymo suma:");
        int plr1Bet = VcsUtils.inputInt();
        p1.decCash(plr1Bet);
        p1.setLastBet(plr1Bet);
        VcsUtils.println(p2.getName() + " iveskite statymo suma:");
        int plr2Bet = VcsUtils.inputInt();
        p2.decCash(plr2Bet);
        p2.setLastBet(plr2Bet);

        int lastBet = plr2Bet;
        if(plr1Bet > plr2Bet){
            lastBet = plr1Bet;
            this.activePlayer = p2;
        }

        boolean continueGame = true;
        if (plr1Bet != plr2Bet) {
            VcsUtils.println(this.activePlayer.getName() + ", priesininkas pakele statyma iki " + lastBet + ", ar norite islyginti? (0) - ne , (1) - taip");
            int plrChoise = VcsUtils.inputInt();
            if (plrChoise == 1) {
                activePlayer.decCash(lastBet - activePlayer.getLastBet());
                activePlayer.setLastBet(lastBet);
            } else {
                continueGame = false;
            }
        }



        if(continueGame) {
            this.p1.rollHand();
            this.p2.rollHand();
            VcsUtils.println(this.p1 + "isrideno: " + GameUtils.intArrayToString(this.p1.getHand().getHandArray()));
            VcsUtils.println(this.p2 + "isrideno: " + GameUtils.intArrayToString(this.p2.getHand().getHandArray()));
            this.activePlayer = p1;
            reRoll();
            this.activePlayer = p2;
            reRoll();
            Player winner = GameUtils.kasLaimejo(p1,p2);
            winner.incChash(winner.getHand().getCombination().getBonus());
            VcsUtils.println(winner.getName() + " Laimejo si zaidima");
        }
        else{
            VcsUtils.println("Zaidimas baigtas" + activePlayer.getName());
        }
    }
    private void reRoll (){
        VcsUtils.println(activePlayer.getName()  + " ar norite perridenti kauliuku? (0) - ne , (1) - taip");
        int plr1ReRollChoice = VcsUtils.inputInt();
        if (plr1ReRollChoice == 1) {
            VcsUtils.println(activePlayer.getName() + ", iveskite kamuoliuku numerius, kuriuos norite perridenti atskirtus kableliu, pvz.: 1,3");
            String kauliukaiStr = VcsUtils.inputWord();
            activePlayer.getHand().reRollDice(kauliukaiStr);
            VcsUtils.println(activePlayer.getName() + ", jusu kombinacija " + GameUtils.intArrayToString(activePlayer.getHand().getHandArray()));
        }
    }
}


