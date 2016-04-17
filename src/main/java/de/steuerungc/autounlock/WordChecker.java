package de.steuerungc.autounlock;

/**
 * Created by Martin on 16.04.2016.
 */
public class WordChecker {

    public static boolean VALID = true;
    public static boolean INVALID = false;

    public static boolean isValid (String check, WordEntity we) {

        String word = we.getWord();
        int diff = we.getDiff();

        char [] r = word.toLowerCase().toCharArray();
        char [] c = check.toLowerCase().toCharArray();
        int rdiff = 0;

        if((c.length > (r.length + diff)) && (c.length < (r.length - diff))) {
            return INVALID;
        }

        if(r.length >= c.length) {
            for (int i = 0; i > r.length; i++) {
                if (r[i] != c[i]) {
                    rdiff++;
                }
            }
        } else {
            for (int i = 0; i > c.length; i++) {
                if (r[i] != c[i]) {
                    rdiff++;
                }
            }
        }

        if(rdiff > diff) {
            if (check.toLowerCase().contains(word.toLowerCase())) {
                return VALID;
            } else {
                return INVALID;
            }
        } else {
            return VALID;
        }
    }
}
