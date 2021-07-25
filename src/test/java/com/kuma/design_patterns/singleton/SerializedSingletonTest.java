package com.kuma.design_patterns.singleton;


import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * Created by bearhsu2 on 10/10/2016.
 */
public class SerializedSingletonTest {
    @Test
    public void testSerializedSingleTon() throws Exception {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        // serialize to file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

    }
}
