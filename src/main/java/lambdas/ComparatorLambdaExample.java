package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
//        prior java -8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator is: "+ comparator.compare(3,2));

//        after java-8

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of comparator using Lambdas is: "+ comparatorLambda.compare(2,3));

        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
        System.out.println("Result of comparator using Lambdas is: "+ comparatorLambda1.compare(2,2));

    }
}
