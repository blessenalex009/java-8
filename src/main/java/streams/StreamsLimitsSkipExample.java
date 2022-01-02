package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitsSkipExample {
    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(3)
                .reduce((x, y) -> x+y);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                .skip(3)
                .reduce((x, y) -> x+y);
    }


    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(4, 5, 1, 8, 3, 9);
        if (limit(integersList).isPresent()) {
            System.out.println("Max Value: " + limit(integersList).get());
        }

        if (skip(integersList).isPresent()) {
            System.out.println("Max Value: " + skip(integersList).get());
        }

    }

}
