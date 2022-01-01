package functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(2,3));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy((a,b)-> a.compareTo(b));
        System.out.println(maxBy.apply(2,3));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy((a,b)-> a.compareTo(b));
        System.out.println(minBy.apply(2,3));
    }

}
