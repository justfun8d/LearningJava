package one.two.three._01_collections.exercises.www_w3resource_com._01_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_ {
    public static void main(String[] args) {
        new _01_().run();
    }

    void run(){
        //1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

        List<String> list=new ArrayList<>();

        list.add("yellow");
        list.add("blue");
        list.add("white");
        list.add("green");

        System.out.println(list);
    }
}
