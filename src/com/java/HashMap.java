package com.java;

public class HashMap<I extends Number, S> {

    public static void main(String[] args) {

        HashMap<Integer,String> languages = new HashMap<>();

        languages. put("Java");
        languages.put("Python");
        languages.put(".Net");

        System.out.println(languages);

        if(languages.containsKey(1)){
            System.out.println(languages.getClass(1));

        }

        if(!languages.isEmpty());
        System.out.println("Hasgmap Contains Mappings");
    }


    private boolean isEmpty() {
        return false;
    }

    private boolean getClass(I i) {
        return false;
    }

    private boolean containsKey(I i) {
        return false;
    }

    private void put(S java) {
    }
}
