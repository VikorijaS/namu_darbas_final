package lt.vcs;

/**
 * Created by Cukrus on 2016.10.21.
 */
public class Testas {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] handArr = GameUtils.rollHand();
        VcsUtils.println(GameUtils.intArrayToString(handArr));
        Hand hand = new Hand(handArr);
        VcsUtils.println(""+hand.getCombination().name());
        VcsUtils.println("Took: " + (System.currentTimeMillis() - start) + " millis");
    }

}
