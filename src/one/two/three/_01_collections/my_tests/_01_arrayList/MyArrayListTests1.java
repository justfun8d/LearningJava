package one.two.three._01_collections.my_tests._01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTests1 {

    public void run() {

        int number = 3;
        switch (number) {
            case 1 -> _01_addAll();
            case 2 -> _02_addAllIndex();
            case 3 -> _03_contains();
        }
    }

    void _01_addAll() {
        List<Integer> myList01 = new ArrayList<>();
        myList01.add(1);
        myList01.add(2);
        myList01.add(3);

        List<Integer> myList02 = new ArrayList<>();

        myList02.add(7);
        myList02.add(0);
        myList02.add(-23);

        myList01.addAll(myList02);

        System.out.println(myList01);
    }

    void _02_addAllIndex() {
        List<Integer> myList01 = new ArrayList<>();
        myList01.add(1);
        myList01.add(2);
        myList01.add(3);
        System.out.println(myList01);

        List<Integer> myList02 = new ArrayList<>();

        myList02.add(7);
        myList02.add(0);
        myList02.add(-23);
        System.out.println(myList02);

        myList01.addAll(2, myList02);

        System.out.println(myList01);
    }

    void _03_contains() {
        List<Integer> myList01 = new ArrayList<>();
        myList01.add(1);
        myList01.add(2);
        myList01.add(3);
        System.out.println(myList01);

        boolean isContains=false;
        isContains=myList01.contains(0);
        System.out.println(isContains);


        MyArrayListTests_03_sampleObject some=new MyArrayListTests_03_sampleObject(3,4,5);
        MyArrayListTests_03_sampleObject someOther=new MyArrayListTests_03_sampleObject(3,4,5);

        List<MyArrayListTests_03_sampleObject> myList02=new ArrayList<>();
        myList02.add(some);
        boolean isContains02=myList02.contains(someOther);
        System.out.println("isContains02="+isContains02);

        List<MyArrayListTests_03_sampleObject> myList03=new ArrayList<>();
        myList03.add(some);
        myList03.add(someOther);

        System.out.println("myList02="+myList02);
        System.out.println("myList03="+myList03);

        boolean isContains03=myList02.containsAll(myList03);
        System.out.println("myList02.containsAll(myList03)="+isContains03);

        boolean isContains04=myList03.containsAll(myList02);
        System.out.println("myList03.containsAll(myList02)="+isContains04);

    }

}
