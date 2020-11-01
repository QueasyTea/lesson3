package ru.geekbrains.java_2_lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] word = {"Найти", "вывести", "список", "уникальных", "слов", "состоит", "массив", "Посчитать", "сколько", "встречается", "слов"};
        List<String> string = converToList(word);
        Set<Integer> uniqueString = new HashSet(string); //<>
        System.out.println(uniqueString);
        System.out.println(countNonUnique(string));
    }
    static List<String> converToList(String[] words){
        List<String> strings = new ArrayList<>();
        for (String word: words){
            strings.add(String.valueOf((word)));
        }
        return strings;
    }
    static Object countNonUnique(List<String> strings){
        Map<String, Integer> counter = new HashMap<>();
        for (String string : strings) {
            if (!counter.containsKey(string)) {
                counter.put(string, 1);
            }else {
                counter.put(string, counter.get(string)+ 1);
            }
        }
        return counter;
    }
}
