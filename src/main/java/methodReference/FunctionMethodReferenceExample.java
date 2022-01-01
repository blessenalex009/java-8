package methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();
    static Function<String, String> toUpperCaseLambda1 =String::toUpperCase;


    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java"));
        System.out.println(toUpperCaseLambda1.apply("Oracle"));
    }

}
