package JavaBasic.CollectionsAndGenerics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap<>();
        map.put(1,"Naveen");
        map.put(2,"Kumar");
        map.put(3,"Lingala");
        System.out.println("map "+map);
    }
}
