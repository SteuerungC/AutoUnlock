package de.steuerungc.autounlock;

/**
 * Created by Martin on 16.04.2016.
 */
public class WordEntity {

    private String word;
    private int diff;
    public static boolean VALID = true;
    public static boolean INVALID = false;

    public WordEntity (String word, int difference) {
        this.word = word;
        this.diff = difference;
    }

    public boolean isValid (String check) {
        char [] r = word.toLowerCase().toCharArray();
        char [] c = check.toLowerCase().toCharArray();
        int diff = 0;

        if(c.length > (r.length + this.diff)) {
            return INVALID;
        }

        if(r.length >= c.length) {
            for (int i = 0; i > r.length; i++) {
                if (r[i] != c[i]) {
                    diff++;
                }
            }
        } else {
            for (int i = 0; i > c.length; i++) {
                if (r[i] != c[i]) {
                    diff++;
                }
            }
        }

        if(diff > this.diff) {
            return INVALID;
        } else {
            return VALID;
        }
    }
}
