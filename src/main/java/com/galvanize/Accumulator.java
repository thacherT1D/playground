package com.galvanize;

import java.time.LocalDateTime;
import java.util.List;

public class Accumulator {
    public String toSentence(String[] input) {

        String output = "";

        if(input.length == 0 || input[0] == ""){
            output = "";
            return output;
        }

        for(int i = 0; i < input.length -2; i++ ) {
            String name = input[i];
            output += name + ", ";
        }

        output +=  input[input.length-2] + " and " + input[input.length-1];

        return output;

    }

}

//Input [""] should return ""
//Input [] should return ""
//Input ["Alice", "Bob"] should return "Alice and Bob"
//Input ["Alice", "Bob", "Carol"] should return "Alice, Bob and Carol"
