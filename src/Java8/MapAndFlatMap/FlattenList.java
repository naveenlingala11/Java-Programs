package Java8.MapAndFlatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        List<Integer> flattenedList = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("Flattened list: "+flattenedList);
    }
}
