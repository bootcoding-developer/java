package com.bootcoding.java.hashcode;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class HashCodeExample {

    //Class Object is the root of the class hierarchy.
    // Every class has Object as a superclass. All objects,
    // including arrays, implement the methods of this class.
    public static void main(String[] args) throws IOException {
        HashCodeExample hc = new HashCodeExample();
        HashMap<Restaurant, Integer> map = new HashMap<>();
        map.put(new Restaurant("Barbeque Nation", "Nagpur", "NON_VEG"), 1);
        map.put(new Restaurant("Haldiram", "Nagpur", "VEG"), 2);
        map.put(new Restaurant("Baba Biryani", "Nagpur", "NON_VEG"), 3);
        map.put(new Restaurant("Chaska", "Nagpur", "VEG"), 4);
        map.put(new Restaurant("Ram Bhandar", "Nagpur", "VEG"), 5);

        System.out.println(map.get(new Restaurant("Ram Bhandar", "Nagpur", "VEG")));

    }
}
