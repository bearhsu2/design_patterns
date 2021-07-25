package com.kuma.design_patterns.singleton;

/**
 * Created by bearhsu2 on 10/10/2016.
 */
// Same as Lazy Initialization, but it is thread safe.
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    public static synchronized ThreadSafeSingleton getInstance(){

        if (null == instance){
            instance = new ThreadSafeSingleton();
        }
        return instance;

    }
}
