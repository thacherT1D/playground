package com.galvanize;

import java.lang.reflect.Array;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.*;
import java.lang.*;

public class Application {

    interface Food {
        public void eat();
        public boolean hasGluten();
    }

    public interface Browseable {
        public void visit(URI uri);
        public URI getCurrentPage();
    }

    public static void main(String[] args) {

//        Math math = new Math(1, 2);
//        System.out.println(math.addition());

//        Accumulator accumulator = new Accumulator();
//        String[] input = new String[] {"Alice", "Bob", "Carol", "Jeff"};
//        System.out.println(accumulator.toSentence(input));

//        List<String> fileNames = new ArrayList<>(Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"));
//
//        fileNames.forEach(fileName -> {
//            fileName = fileName.replaceAll(" ", "-");
//            fileName = fileName.toLowerCase();
//
//            System.out.println(fileName);
//        });

//        List<String> a = new ArrayList<>(Arrays.asList("a", "b", "c"));
//        List<String> b = new ArrayList<>(Arrays.asList("d", "e", "f"));
//        String output = "";
//
//        for(int i = 0; i < a.size(); i++) {
//            output += a.get(i);
//            output += b.get(i);
//        }
//        System.out.println(output);
//        }

//        String input = "gfjfgkk";
//
//        List<String> wordList = Arrays.asList(input.split(""));
//
//        System.out.println(wordList);
//
//        Map<String, Long> wordMap = new HashMap<>();

//        if(input == ""){
//            System.out.println(Collections.emptyMap());
//            }
//
//        wordList.forEach(letter -> {
//            if (wordMap.get(letter) != null) {
//                long num = wordMap.get(letter) + 1;
//                wordMap.replace(letter, num);
//            } else {
//                wordMap.put(letter, 1L);
//            }
//        });
//
//        System.out.println(wordMap);


//        java.time.LocalDateTime now = java.time.LocalDateTime.now();
//        System.out.println(now);

//        public class Browser {
//            private URI currentPage;
//            private ArrayList<String> history;
//            private LocalDateTime visitedAt;
//            private HashMap<String, Integer> visitCount;
//            private boolean on;
//        }




        class HotDog implements Food {
            private ArrayList<String> toppings = new ArrayList<>();

            @Override
            public void eat() {

            }

            @Override
            public boolean hasGluten() {
                return true;
            }

            public boolean isChiliDog() {
                return toppings.contains("Chili");
            }
        }

        Food lunch = new HotDog();
        System.out.println(lunch.hasGluten());

        class Crawler implements Browseable {

            private URI currentPage;

            @Override
            public void visit(URI uri) {
                this.currentPage = uri;
            }
            @Override
            public URI getCurrentPage() {
                return this.currentPage;
            }
        }

        Crawler crawler = new Crawler();
        crawler.visit();
        System.out.println(crawler.getCurrentPage());


    }}
