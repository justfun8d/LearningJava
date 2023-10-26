package one.two.three._01_collections.exercises.www_w3resource_com._01_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _03_ {
    public static void main(String[] args) {
        new _03_().run();
    }

    void run(){
        //3. Write a Java program to insert an element into the array list at the first position.

        List<String> list=new ArrayList<>();

        list.add("yellow");
        list.add("blue");
        list.add("white");
        list.add("green");

        System.out.println(list);

        list.add(0, "MYNEWBESTCOLOR");

        System.out.println(list);
        list.sort();
        System.out.println(list);
    }
}
