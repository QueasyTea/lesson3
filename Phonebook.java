package ru.geekbrains.java_2_lesson3;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, Set<String >> phonebook;

    public Phonebook(){
        this.phonebook = new HashMap<>();
    }
    public void add(String name, String number){
        if (phonebook.containsKey(name)){
            phonebook.get(name).add(number);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            phonebook.put(name,numbers);
        }
    }

    public Set<String> get(String name) {
        if (phonebook.get(name) == null){
            return new HashSet<>();
        }
        return phonebook.get(name);
    }

}
