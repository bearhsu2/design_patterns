package com.kuma.playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//    * Map<Integer, List<Integer>>
//* answers isEmpty
//* answers size (# of keys)
//* answers total # of values (across all keys)
//* put(key, value)
//* get returns a list of KeyType objects
//* throw exception on null key
public class MultiMap {

    private final Map<Integer, List<Integer>> map = new HashMap<>();

    public boolean isEmpty() {

        return map.keySet().isEmpty();
    }

    public void put(int key, int value) {


        if (!this.map.containsKey(key)) {
            this.map.put(key, new ArrayList<>());
        }
        this.map.get(key).add(value);


    }

    public int size() {
        return this.map.size();
    }


    public int total() {

        return this.map.keySet().stream().mapToInt(key -> this.map.get(key).size()).sum();

    }

    public List<Integer> get(int key) {

        return this.map.get(key);
    }
}
