package de.steuerungc.autounlock;

/**
 * Created by Martin on 16.04.2016.
 */
public class ExpressionEntity {

    private String ex;
    private int mode;

    public ExpressionEntity (String experssion, int mode) {
        ex = experssion;
        mode = this.mode;
    }

    public String getExpression () {
        return ex;
    }

    public int getMode () {
        return mode;
    }
}
