package one.two.three;

import java.util.Objects;

public class MyArrayListTests_03_sampleObject {
    int a;
    int b;
    int c;

    MyArrayListTests_03_sampleObject(){
        a=1;
        b=2;
        c=3;
    }

    MyArrayListTests_03_sampleObject(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public boolean equals(Object o){

        if(o==this){
            return true;
        }

        if(o==null || o.getClass()!=this.getClass()){
            return false;
        }

        MyArrayListTests_03_sampleObject thisO=(MyArrayListTests_03_sampleObject) o;
        return this.a==thisO.a && this.b== thisO.b && this.c== thisO.c;

    }

    public int oldHash(){
        return super.hashCode();
    }

    @Override
    public int hashCode(){
        int primal=73;
        int hash=0;
        hash=(hash+a)*primal;
        hash=(hash+b)*primal;
        hash=(hash+c)*primal;

        return hash;
    }

    @Override
    public String toString(){
        return "{"+a+", "+b+", "+c+"}";
    }

}
