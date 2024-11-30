package org.tns.capgemini.c2tc.collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 100);  // Key: 1, Value: 100
        map.put(2, 200);  // Key: 2, Value: 200
        map.put(3, 300);  // Key: 3, Value: 300
        map.put(4, 400);  // Key: 4, Value: 400

        System.out.println("Initial Map: " + map);

        int valueForKey1 = map.get(1);
        System.out.println("Value for key '1': " + valueForKey1);

        map.put(2, 250);  
        System.out.println("Map after updating value for key '2': " + map);

        map.remove(3); 
        System.out.println("Map after removing key '3': " + map);

        boolean hasKey1 = map.containsKey(1);
        System.out.println("Map contains key '1': " + hasKey1);

        boolean hasValue400 = map.containsValue(400);
        System.out.println("Map contains value 400: " + hasValue400);

        System.out.println("Iterating over keys and values:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        int size = map.size();
        System.out.println("Size of the map: " + size);
        
        map.clear();
        System.out.println("Map after clearing: " + map);
        
    }
}