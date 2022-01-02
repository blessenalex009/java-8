package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamsExample {

    public static void main(String[] args) {
        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>3;
        Predicate<Student> studentPredicate1 = student -> student.getGpa()>3.5;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .peek(student -> System.out.println("First peek "+student))
//                .filter(student -> student.getGradeLevel()>3)
//                .filter(student -> student.getGpa()>3.5)
//                .filter(studentPredicate.and(studentPredicate1))
                .filter(studentPredicate)
                .peek(student -> System.out.println("After 1st filter "+student))
                .filter(studentPredicate1)
                .peek(student -> System.out.println("After 2nd filter "+student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);

    }

}
