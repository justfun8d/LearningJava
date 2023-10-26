package one.two.three._01_collections.exercises.www_w3resource_com._01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class _05_ {
    public static void main(String[] args) {
        new _05_().run();
    }

    void run(){
        //5. Write a Java program to update an array element by the given element.
        //5. Напишите программу на Java для обновления элемента массива по заданному элементу.

        List<String> list=new ArrayList<>();

        list.add("yellow");
        list.add("blue");
        list.add("white");
        list.add("green");

        System.out.println(list);
        
        list.set(2, "newColor");

        System.out.println(list);
    }
}
