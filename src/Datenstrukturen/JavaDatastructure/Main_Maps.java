package Datenstrukturen.JavaDatastructure;

import java.util.HashMap;
import java.util.Map;

public class Main_Maps {
    public static void main(String[] args) {
        Map<String,Float> map = new HashMap<>();

        map.put("Osama",1.0f);
        map.put("Farah",1.3f);
        map.put("Hanan",1.3f);
        map.put("Osama Alhamada", 1.7f);

        System.out.println("Map: " + map);

        System.out.println("Size: " + map.size());

        System.out.println("Note von Osama: " + map.get("Osama"));
    }
}
