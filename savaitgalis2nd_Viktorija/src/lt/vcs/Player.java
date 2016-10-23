package lt.vcs;

/**
 * Created by Cukrus on 2016.10.20.
 */
public class Player {
    private String name;
    private int cash = 150;
    private int lastBet;

    private Hand hand = new Hand(GameUtils.rollHand());

    /** zaidejo konstruktorius
     * @param name zaidejo vardas
     */
    public Player(String name) {
        this.name = name;
    }

    public String getStats() {
        return name + "(cash: " + cash + ")";
    }

    public String getName() {
        return name;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void decCash(int bet){
       this.cash -= bet;
    }

    public void incChash(int win ){
        this.cash += win;
    }

    public Hand getHand() {
        return hand;
    }
    public void rollHand(){
        this.hand = new Hand(GameUtils.rollHand());
    }

    public int getLastBet() {
        return lastBet;
    }

    public void setLastBet(int lastBet) {
        this.lastBet = lastBet;
    }
}
