package JavaBasic.CollectionsAndGenerics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Naveen");
        names.add("Naveen");
        names.add("Kumar");
        names.add("Lingala");
        names.add("Lingala");
        System.out.println("Set "+ names);
    }
}
