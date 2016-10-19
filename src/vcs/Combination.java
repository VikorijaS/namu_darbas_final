package vcs;

/**
 * galimos kauliuku pokerio kombinacijos ir ju bonus laimejimai
 */
public enum Combination {
    /** nera kombinacijos (high number) [bonus - 0] */
    NONE(0),

    /** pora - 2 vienodi (pair - 2 of a kind) [bonus - 0] */
    PAIR(0),

    /** 2 poros (2 pairs) [bonus - 5] */
    PAIR2(5),

    /** 3 vienodi (3 of a kind) [bonus - 10] */
    KIND3(10),

    /** eile (straight) [bonus - 15] */
    STRAIGHT(15),

    /** pilna troba - pora ir 3 vienodi (full house) [bonus - 20] */
    FULL_HOUSE(20),

    /** 4 vienodi (4 of a kind) [bonus - 25] */
    KIND4(25),

    /** 5 vienodi (5 of a kind) [bonus - 30] */
    KIND5(30);

    private int bonus;

    public int getBonus() {
        return bonus;
    }

    private Combination(int bonus) {
        this.bonus = bonus;
    }

    //TODO: prideti bonusu kintamaji, parasyti konstruktoriu, padaryti metoda, leidzianti
    //gauti bonuso kintamaji (Alt+insert  arba  Code->Generate...)

}
