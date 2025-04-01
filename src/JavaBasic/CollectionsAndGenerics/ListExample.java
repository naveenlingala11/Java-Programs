package JavaBasic.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Naveen");
        names.add("Kumar");
        names.add("Lingala");

        System.out.println("List "+names);
    }
}
