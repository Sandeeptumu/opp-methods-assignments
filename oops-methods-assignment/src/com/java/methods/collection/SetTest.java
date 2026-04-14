package com.java.methods.collection;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Sandeep");
        set.add("Lalith");
        set.add(2);
        set.add("Sandeep");

        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains(2));

        set.remove(2);

        System.out.println(set);

        set.add(23131);
        set.add("Muktheshwar");

        System.out.println(set);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<String> names = new HashSet<>();
        names.add("Sanjay");
        names.add("kutty");
        names.add("Kushaal");
        names.add("Neha");
        System.out.println(names);

        Iterator<String> iterator1 = names.iterator();

        while (iterator1.hasNext()){
            String names2 = iterator1.next();
            System.out.println(names2);
        }

        Set<String> email = new TreeSet<>();
        email.add("tumusandeep0000@gmail.com");
        email.add("sanjay0000@gmail.com");
        email.add("aswith0000@gmail.com");
        email.add("kavya0000@gmail.com");

        System.out.println(email);

    }
}
