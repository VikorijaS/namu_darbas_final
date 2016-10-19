package vcs;

import java.util.concurrent.ThreadLocalRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //----------------------------------

        int p1Cash = 150; //pradine zaideju turima suma
        int p2Cash = 150;


        VcsUtils.println("Kauliuku pokeris");
        VcsUtils.println("Zaidejas 1, iveskite savo varda");
        String player1 = VcsUtils.inputWord();
        VcsUtils.println("Zaidejas 2, iveskite savo varda");
        String player2 = VcsUtils.inputWord();

//        do {
        VcsUtils.println(player1 + " iveskite statymo suma:");
        int plr1Bet = VcsUtils.inputInt();
        VcsUtils.println(player2 + " iveskite statymo suma:");
        int plr2Bet = VcsUtils.inputInt();
        boolean continueGame = true;

        while (continueGame && plr2Bet != plr1Bet) {
            if (plr2Bet > plr1Bet) {
                VcsUtils.println(player1 + ", priesininkas pakele statyma iki " + plr2Bet + ", ar norite islyginti? (0) - ne , (1) - taip");
                int plr1Choice = VcsUtils.inputInt();
                if (plr1Choice == 1) {
                    plr1Bet = plr2Bet;
                } else {
                    p1Cash -= plr1Bet;
                    continueGame = false;
                }
            }
            if (plr2Bet < plr1Bet) {
                VcsUtils.println(player2 + ", priesininkas pakele statyma iki " + plr1Bet + ", ar norite islyginti? (0) - ne , (1) - taip");
                int plr2Choice = VcsUtils.inputInt();
                if (plr2Choice == 1) {
                    plr2Bet = plr1Bet;
                } else {
                    p2Cash -= plr2Bet;
                    continueGame = false;
                }
            }

            int[] plr1Hand = rollHand();
            int[] plr2Hand = rollHand();
            VcsUtils.println(player1 + " isrideno: " + intArrayToString(plr1Hand));
            VcsUtils.println(player2 + " isrideno: " + intArrayToString(plr2Hand));
            //pirmas isridenimas baigtas


            VcsUtils.println(player1 + " iveskite statymo suma:");
            int plr1ReBet = VcsUtils.inputInt();
            VcsUtils.println(player2 + " iveskite statymo suma:");
            int plr2ReBet = VcsUtils.inputInt();

            int plr1ReMinBet = p1Cash - plr1ReBet;
            int plr2ReMinBet = p2Cash - plr2ReBet;
            int plr1ReReBet = VcsUtils.inputInt();
            int plr2ReReBet = VcsUtils.inputInt();

            boolean continueBet = true;
            while (continueBet && plr1ReReBet != plr1ReMinBet) {
                if (plr1ReReBet > plr1ReMinBet) {
                    VcsUtils.println(player1 + ", antras statymas negali būti mažesnis nei " + plr1ReBet + ", ar norite baigti zaidima? (0) - ne , (1) - taip");
                    int plr1Choice = VcsUtils.inputInt();
                    if (plr1Choice == 1) {
                        VcsUtils.println(player2 + "laimejo");
                        continueBet = false;

                    } else {
                        VcsUtils.println("Prasome paimti kredita ir testi zaidima");
                        continueBet = true;

                    }
                }

                if (plr2ReReBet > plr2ReMinBet) {
                    VcsUtils.println(player2 + ", antras statymas negali būti mažesnis nei " + plr2ReBet + ", ar norite baigti zaidima? (0) - ne , (1) - taip");
                    int plr2Choice = VcsUtils.inputInt();
                    if (plr2Choice == 1) {
                        VcsUtils.println(player1 + "laimejo");
                        continueBet = false;

                    } else {
                        VcsUtils.println("Prasome paimti kredita ir testi zaidima");
                        continueBet = true;

                    }
                }

                while (continueGame && plr2ReBet != plr1ReBet) {

                    if (plr2ReBet > plr1ReBet) {
                        VcsUtils.println(player1 + ", priesininkas pakele statyma iki " + plr2ReBet + ", ar norite islyginti? (0) - ne , (1) - taip");

                        int plr3Choice = VcsUtils.inputInt();
                        if (plr3Choice == 1) {
                            plr1ReBet = plr2ReBet;
                        } else {
                            p1Cash -= (plr1Bet + plr1ReBet);
                            continueGame = false;
                        }
                    }
                    if (plr2ReBet < plr1ReBet) {
                        VcsUtils.println(player2 + ", priesininkas pakele statyma iki " + plr1ReBet + ", ar norite islyginti? (0) - ne , (1) - taip");
                        int plr4Choice = VcsUtils.inputInt();
                        if (plr4Choice == 1) {
                            plr2ReBet = plr1ReBet;
                        } else {
                            p2Cash -= (plr2Bet + plr2ReBet);
                            continueGame = false;
                        }
                    }

                    VcsUtils.println(player1 + ", jusu kombinacija " + intArrayToString(plr1Hand) + " ar norite perridenti kauliuku? (0) - ne , (1) - taip");
                    int plr1ReRollChoice = VcsUtils.inputInt();
                    if (plr1ReRollChoice == 1) {
                        VcsUtils.println(player1 + ", iveskite kamuoliuku numerius, kuriuos norite perridenti atskirtus kableliu, pvz.: 1,3");
                        String kauliukaiStr = VcsUtils.inputWord();
                        for (String sk : kauliukaiStr.split(",")) {
                            Integer kauliukoNr = new Integer(sk);
                            reRollDice(plr1Hand, kauliukoNr);
                        }
                        VcsUtils.println(player1 + ", jusu kombinacija " + intArrayToString(plr1Hand));
                    }
                    VcsUtils.println(player2 + ", jusu kombinacija " + intArrayToString(plr2Hand) + " ar norite perridenti kauliuku? (0) - ne , (1) - taip");
                    int plr2ReRollChoice = VcsUtils.inputInt();
                    if (plr2ReRollChoice == 1) {
                        VcsUtils.println(player2 + ", iveskite kamuoliuku numerius, kuriuos norite perridenti atskirtus kableliu, pvz.: 1,3");
                        String kauliukaiStr = VcsUtils.inputWord();
                        for (String sk : kauliukaiStr.split(",")) {
                            Integer kauliukoNr = new Integer(sk);
                            reRollDice(plr2Hand, kauliukoNr);
                        }
                        VcsUtils.println(player2 + ", jusu kombinacija " + intArrayToString(plr2Hand));
                    }
/** Čia bandau padaryti, kad bet kuriuo metu, kai iškrenta du kart kamuoliukai, duoda pasitikrinti balansa.
 *
 */


                    //zaidimo galas
                    int plr1Sum = getSum(plr1Hand);
                    int plr2Sum = getSum(plr2Hand);
                    int totalBet = plr1Bet + plr1ReBet;
                    if (plr1Sum > plr2Sum) {
                        p1Cash += totalBet;
                        p2Cash -= totalBet;
                        VcsUtils.println(player1 + "laimejo!");
                    } else if (plr1Sum < plr2Sum) {
                        p2Cash += totalBet;
                        p1Cash -= totalBet;
                        VcsUtils.println(player2 + "laimejo!");
                    } else {
                        VcsUtils.println("Lygiosios, statymo sumos grazintos zaidejam");
                    }
                    VcsUtils.println(player1 + "pinigu likutis:" + p1Cash);
                    VcsUtils.println(player2 + "pinigu likutis:" + p2Cash);

                    String Balansas1 = VcsUtils.inputWord();
                    VcsUtils.println("Pirmo žaidėjo laimėjimas " + player1 + p1Cash);

                    String Balansas2 = VcsUtils.inputWord();
                    VcsUtils.println("antro žaidėjo laimėjimas " + player2 + p2Cash);


                    String zodis = VcsUtils.inputWord();
                    while (zodis != "baigti") {
                        zodis = VcsUtils.inputWord();
                    }

                    System.exit(0);
                    System.out.println("Aciu, kad zaidete");


//        int[] arr = {1, 3, 5};// pavyzdys :)
//        VcsUtils.println(intArrayToString(arr));//pagalbinio metodo naudojimo pvz, kuri issitrinkit arba uzsikomentuokit :)
//        VcsUtils.println("" + arr[1]);//priminimas kaip galima pasiekti masyvo elementus :)

                    //TODO: jums prireiks jau naudotu metodu is String klases
                    //P.S. nepamirskit apziureti klasiu turimu metodu dokumentacijos pagalba (Ctrl+q  arba  View->Quick Documentation)
                    //P.P.S. Jei iskyla klausimu nebijokit ju uzduoti FB komentaruose po namu darbu ar rasyti PM, nors geriau komentuoti,
                    // nes gali buti naudinga ir kitiems :)
                    //TODO: Google is your friend ;)


                    //----------------------------------
                    //-----main end-----\\

                }
            }
        }
    }
















    private static int getSum() {
        return getSum();
    }

    private static int getSum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    private static void reRollDice(int[] hand, int dicePos) {
        hand[dicePos-1] = rand();
    }

    private static int[] rollHand() {
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            result[i] = rand();
        }
        return result;
    }

    private static int rand() {
        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }

    /**
     * isvercia masyvo reiksmes i suprantama formata
     *
     * @param arr masyvas, kuri versim
     * @return suprantama masyvo tekstine reprezentacija
     */
    private static String intArrayToString(int[] arr) {
        String result = "";
        for (int val : arr) {
            result += "[" + val + "] ";
        }
        return result.trim();
    }


    //TODO: nebijokit pasirasyti sau pagalbiniu metodu, jei reikia/norit, jie padaro koda tvarkingesni
    // pvz galit pasirasyti metoda pagalbini random generavimui kad nereiktu pastoviai rasyti ilgu litaniju
    // ThreadLocalRandom.current().nextInt(min, max + 1);
    //TODO: nepamirskit kad main metodas statinis todel ir pagalbiniai metodai turetu buti statiniai, kad
    //juos butu galima naudoti main metode

}

