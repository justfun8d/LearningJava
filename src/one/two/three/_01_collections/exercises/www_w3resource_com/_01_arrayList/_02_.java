package one.two.three._01_collections.exercises.www_w3resource_com._01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class _02_ {
    public static void main(String[] args) {
        new _02_().run();
    }

    void run(){
        //2. Write a Java program to iterate through all elements in an array list.

        List<String> list=new ArrayList<>();

        list.add("yellow");
        list.add("blue");
        list.add("white");
        list.add("green");

        for (String str:
             list) {
            System.out.println(str);
        }
    }
}
