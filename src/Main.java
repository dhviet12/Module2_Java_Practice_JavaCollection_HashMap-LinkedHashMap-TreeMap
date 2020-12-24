import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // create Hashmap
        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Viet",23);
        myHashMap.put("Nam", 24);
        myHashMap.put("Trung",18);
        System.out.println(myHashMap);
        // create Treemap
        Map<String, Integer> myTreeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        // sap xep Alphabet
        myTreeMap.put("John",10);
        myTreeMap.put("Alex",11);
        myTreeMap.put("Min",13);
        System.out.println(myTreeMap);
        // create LinkedHashmap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // sap xep theo thu tu dong code
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
