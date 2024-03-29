package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name +" : "+activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,b) -> System.out.println("a: "+a+" b: "+b);
        biConsumer.accept("Java 7","Java 8");

        BiConsumer<Integer,Integer> multiply = (a,b) -> System.out.println("Multiplication is: "+(a*b));

//        multiply.accept(3,2);
        BiConsumer<Integer,Integer> divide = (a,b) ->  System.out.println("Division is: "+(a/b));


        multiply.andThen(divide).accept(3,2);

        nameAndActivities();
    }
}
