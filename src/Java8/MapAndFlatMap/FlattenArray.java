package Java8.MapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenArray {
    public static void main(String[] args) {
        Integer[][] array = {{1,2,3},{4,5},{6,7,8,9}};

        List<Integer> flattenedList = Arrays.stream(array)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list: "+flattenedList);
    }

}
