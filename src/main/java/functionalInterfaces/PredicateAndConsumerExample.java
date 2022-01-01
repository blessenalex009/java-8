package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
     Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
     Predicate<Student> p2 = student -> student.getGpa()>=3.5;

     BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.5;

     BiConsumer<String, List<String>> stuBiConsumer = (name, activities) -> {
         System.out.println(name +" : "+activities);
     };

     Consumer<Student> consumer = student -> {
//       if(p1.and(p2).test(student)){
         if(biPredicate.test(student.getGradeLevel(),student.getGpa()))
           stuBiConsumer.accept(student.getName(),student.getActivities());
       };


    public void printNameAndActivities(List<Student> studentList){

        studentList.forEach(consumer);

    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
