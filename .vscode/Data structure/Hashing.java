
import java.util.*;

class Hashing {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("india", 120);
        map.put("china", 130);
        map.put("usa", 80);
        System.out.println(map);
        //search
        if (map.containsKey("china")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present");
        }
        System.out.println(map.get("china"));
        System.out.println(map.get("London"));

    }
}
