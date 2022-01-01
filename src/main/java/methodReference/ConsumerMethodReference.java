package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = System.out::println;

    static Consumer<Student> c3 = Student::printListOfActivities;

    public static void main(String[] args) {
//        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);
    }

}
