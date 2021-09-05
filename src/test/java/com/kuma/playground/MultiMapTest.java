package com.kuma.playground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiMapTest {


    @Test
    void initial_then_is_empty() {

        MultiMap map = new MultiMap();

        assertEquals(true, map.isEmpty());

    }

    @Test
    void initial_and_put_1_99_then_is_NOT_empty() {

        MultiMap map = new MultiMap();

        map.put(1, 99);

        assertEquals(false, map.isEmpty());

    }

    @Test
    void initial_and_put_1_99_then_size_is_1() {

        MultiMap map = new MultiMap();

        map.put(1, 99);

        assertEquals(1, map.size());

    }

    @Test
    void initial_and_put_1_99_push_2_98_then_size_is_2() {

        MultiMap map = new MultiMap();

        map.put(1, 99);
        map.put(2, 98);

        assertEquals(2, map.size());

    }

    @Test
    void initial_and_put_1_99_push_1_100_then_total_is_2() {

        MultiMap map = new MultiMap();

        map.put(1, 99);
        map.put(1, 100);

        assertEquals(2, map.total());

    }

    @Test
    void initial_and_put_1_99_push_1_100_when_get_1_then_return_a_list() {

        MultiMap map = new MultiMap();

        map.put(1, 99);
        map.put(1, 100);

        List<Integer> list = map.get(1);

        Assertions.assertEquals(99, list.get(0));
        Assertions.assertEquals(100, list.get(1));

    }
}
