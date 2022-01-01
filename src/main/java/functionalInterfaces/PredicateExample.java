package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate = (i) -> i%2==0;
    static Predicate<Integer> predicate1 = (i) -> i%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate and result is: " +predicate.and(predicate1).test(4));
    }
    public static void predicateOr(){
        System.out.println("Predicate or result is: "+predicate.or(predicate1).test(4));
    }

    public static void predicateNegate(){
        System.out.println("Predicate negate result is: "+predicate.negate().test(2));
    }

    public static void main(String[] args) {

        System.out.println(predicate.test(3));
        System.out.println(predicate.test(2));
        predicateAnd();
        predicateOr();
        predicateNegate();


    }
}
