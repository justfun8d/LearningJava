package one.two.three;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTests {

    void run(){

        int number=1;
        switch (number){
            case 1-> _01_addAll();
        }
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
}
