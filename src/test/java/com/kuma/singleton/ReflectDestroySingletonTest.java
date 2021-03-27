package com.kuma.singleton;

import com.kuma.singleton.EagerInitialization;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by bearhsu2 on 10/10/2016.
 */
public class ReflectDestroySingletonTest {

    @Test
    public void TestReflect() {

        EagerInitialization eagerOne = EagerInitialization.getInstance();
        EagerInitialization eagerTwo = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                eagerTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(eagerOne.hashCode());
        System.out.println(eagerTwo.hashCode());
        assertNotEquals(eagerOne.hashCode(), eagerTwo.hashCode());


    }
}
