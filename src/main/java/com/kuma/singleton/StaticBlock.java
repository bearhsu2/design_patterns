package com.kuma.singleton;

/**
 * Created by bearhsu2 on 10/10/2016.
 */
// Static block initialization implementation is similar to eager initialization.

public class StaticBlock {

    private static StaticBlock instance;

    static {
        instance = new StaticBlock();
    }

    public static StaticBlock getInstance(){
        return instance;
    }

}
