package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExmple {

    public static void main(String[] args) {

       Stream<String> stringStream = Stream.of("A","B","c");
       stringStream.forEach(System.out::println);

       Stream.iterate(1,x->x*2).limit(10).forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).forEach(System.out::println);

    }

}
