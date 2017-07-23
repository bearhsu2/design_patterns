package com.kuma;

/**
 * Created by bearhsu2 on 10/10/2016.
 */

// Create the instance when the instance is accessed for the first time.
public class LazyInitialization {
    private static LazyInitialization instance;

    public static LazyInitialization getInstance(){
        if (null == instance){
            instance = new LazyInitialization();
        }
        return instance;
    }
}

// However, this creation is not thread-safe
