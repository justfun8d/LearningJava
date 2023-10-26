package one.two.three._01_collections.exercises.www_w3resource_com._01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class _04_ {
    public static void main(String[] args) {
        new _04_().run();
    }

    void run(){
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        //4. Напишите программу на Java для извлечения элемента (по указанному индексу) из заданного списка массивов.

        List<String> list=new ArrayList<>();

        list.add("yellow");
        list.add("blue");
        list.add("white");
        list.add("green");

        System.out.println(list);
        
        list.remove(1);

        System.out.println(list);
    }
}
