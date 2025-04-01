package JavaBasic.CollectionsAndGenerics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.add("Naveen");
        names.add("Kumar");
        names.add("Lingala");
        System.out.println("Queue "+ names);
    }
}
