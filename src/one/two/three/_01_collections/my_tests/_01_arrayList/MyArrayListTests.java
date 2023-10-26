package one.two.three._01_collections.my_tests._01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTests {

    void run(){

        int number=101;
        switch (number){
            case 1-> _01_addAll();
            case 100 -> _0Some_retainAll();
            case 101 -> _0Some_removeAll();

        }
        ArrayList<Integer> list2=new ArrayList<>();
    }

    void _01_addAll(){
        List<Integer> myList01=new ArrayList<>();
        myList01.add(1);
        myList01.add(2);
        myList01.add(3);

        List<Integer> myList02=new ArrayList<>();

        myList02.add(7);
        myList02.add(0);
        myList02.add(-23);

        myList01.addAll(myList02);

        System.out.println(myList01);
    }

    void _0Some_retainAll(){

        List<Integer> myList01=new ArrayList<>();
        myList01.add(1);
        myList01.add(2);
        myList01.add(3);
        myList01.add(3);
        myList01.add(-23);
        myList01.add(3);
        myList01.add(-23);
        myList01.add(8);
        myList01.add(7);

        List<Integer> myList02=new ArrayList<>();

        myList02.add(7);
        myList02.add(0);
        myList02.add(-23);

        System.out.println("before");
        System.out.println("myList01="+myList01);
        System.out.println("myList02="+myList02);

        boolean out = myList01.retainAll(myList02);

        System.out.println("after");

        System.out.println("myList01="+myList01);
        System.out.println("myList02="+myList02);

        System.out.println(out);

    }

    void _0Some_removeAll(){

        List<Integer> myList01=new ArrayList<>();
        myList01.add(1);
        myList01.add(2);
        myList01.add(3);
        myList01.add(3);
        myList01.add(-23);
        myList01.add(3);
        myList01.add(-23);
        myList01.add(8);
        myList01.add(7);

        List<Integer> myList02=new ArrayList<>();

        myList02.add(7);
        myList02.add(0);
        myList02.add(-23);

        System.out.println("before");
        System.out.println("myList01="+myList01);
        System.out.println("myList02="+myList02);

        boolean out = myList01.removeAll(myList02);

        System.out.println("after");

        System.out.println("myList01="+myList01);
        System.out.println("myList02="+myList02);

        System.out.println(out);

    }
}
