package one.two.three._01_collections;

import one.two.three._01_collections._01_arrayList.MyArrayListTests1;
import one.two.three._01_collections._02_linkedList.MyLinkedListTests;

public class MyCollections {

    public void run(){

        int test=2;
        switch (test){
            case 1 -> new MyArrayListTests1().run();
            case 2 -> new MyLinkedListTests().run();
        }

    }


}
