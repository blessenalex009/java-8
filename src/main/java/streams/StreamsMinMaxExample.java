package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(4, 5, 1, 8, 3, 9);
        List<Integer> integers = new ArrayList<>();
        System.out.println("Max Value: " + findMaxValue(integersList));

        if (findMaxValueOptional(integers).isPresent()) {
            System.out.println("Max Value: " + findMaxValueOptional(integers).get());
        }
        else
            System.out.println("No max value found");

    }
}
