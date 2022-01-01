package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toLowerCase();
    static Function<String, String> addSomeString = (name) -> name.toLowerCase().concat(" DEFAULT");

    public static void main(String[] args) {

        System.out.println("Result is: "+function.apply("JAVA-8"));
        System.out.println("Result of andThen is: "+function.andThen(addSomeString).apply("JAVA-8"));
        System.out.println("Result of compose is: "+function.compose(addSomeString).apply("JAVA-8"));

    }
}
