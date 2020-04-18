package com.kuma.singleton;

/**
 * Created by bearhsu2 on 10/10/2016.
 */
// The same as Lazy Initialization, but it's more efficient.
public class DoubleCheckThreadSafeSingleton {
    private DoubleCheckThreadSafeSingleton instance;

    public DoubleCheckThreadSafeSingleton getInstance(){
        if (null == instance){
            synchronized (DoubleCheckThreadSafeSingleton.class) {
                if (null == instance){
                    instance = new DoubleCheckThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
