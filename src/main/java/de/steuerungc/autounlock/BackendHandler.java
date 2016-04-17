package de.steuerungc.autounlock;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Martin on 16.04.2016.
 */
public class BackendHandler {

    public HashMap<Integer, WordEntity> giveWords (int qid) {
        HashMap<Integer, WordEntity> m = new HashMap<>();
        m.put(1, new WordEntity("Survival", 3));
        m.put(2, new WordEntity("Server", 2));
        m.put(3, new WordEntity("Gomme", 2));
        return m;
    }

    public ArrayList<ExpressionEntity> giveDeniedExpressions (int qid) {
        ArrayList<ExpressionEntity> m = new ArrayList<>();
        m.add(new ExpressionEntity("\"Ein Survival Server\"", 1));
        m.add(new ExpressionEntity("# 3 *", 1));
        return m;
    }

    public ArrayList<ExpressionEntity> giveAllowedExpressions (int qid) {
        ArrayList<ExpressionEntity> m = new ArrayList<>();
        m.add(new ExpressionEntity("# # 1 2 *", 2));
        m.add(new ExpressionEntity("* 1 2 /", 2));
        return m;
    }
}
