package OOPS.LamdaExpression;

import java.util.ArrayList;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class Lamda {
    public static void main(String[] args) {

        ArrayList<Integer> arr =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        Consumer<Integer> test = (a) -> System.out.println("test"+a); // is interfaced.it is use for storage only use is create single parameter function
        test.accept(12);

        doSomthings fun = (a,b) -> a*b;   // implementing method here for "doo"
        System.out.println(fun.doo(5,6));

    }

    interface doSomthings // is also interfaced like "Consumer".it is use for storage only use is create Custom parameter function

    {
        int doo(int a,int b);
       // int somrthing(int a,int b,int c);    only one single method acceptable
    }
}