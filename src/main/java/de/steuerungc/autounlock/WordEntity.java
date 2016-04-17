package de.steuerungc.autounlock;

/**
 * Created by Martin on 16.04.2016.
 */
public class WordEntity {

    private String w;
    private int d;

    public WordEntity (String word, int difference) {
        w = word;
        d = difference;
    }

    public String getWord() {
        return w;
    }

    public int getDiff() {
        return d;
    }
}
