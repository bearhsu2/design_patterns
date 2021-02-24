package com.kuma.singleton;

/**
 * Created by bearhsu2 on 10/10/2016.
 */

// In eager initialization, the instance of Singleton Class is created at the time of class loading.
public class EagerInitialization {

    private static EagerInitialization eager = new EagerInitialization();

    public static EagerInitialization getInstance(){
        return eager;
    }
}
