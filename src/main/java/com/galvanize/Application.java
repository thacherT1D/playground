package com.galvanize;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

//        Math math = new Math(1, 2);
//        System.out.println(math.addition());

        Accumulator accumulator = new Accumulator();
        String[] input = new String[] {"Alice", "Bob", "Carol", "Jeff"};
        System.out.println(accumulator.toSentence(input));

    }
}
