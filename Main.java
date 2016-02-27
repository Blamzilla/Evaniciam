package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Map characterProperties = new HashMap<String, String>();
        characterProperties.put("Name", "Aesrith");
        characterProperties.put("Gender", "Male");
        characterProperties.put("Hair Color", "Brown");
        characterProperties.put("Hair Length", "Short");
        characterProperties.put("Facial Hair", "Clean");

        System.out.println("Using EntrySet");
        for(Map.Entry<String, String> characterEntry : characterProperties()){
            System.out.println(characterEntry.getKey() + " :: " + characterEntry.getValue());



           }


    }
}
