package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
//        studentList.forEach(student -> System.out.println(student));
    }

    public static void printNameAndActivities(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c3));
//            studentList.forEach(student -> {
//                System.out.print(student.getName());
//                System.out.println(student.getActivities());
//            });
    }
    public static void printNameAndActivitiesWithCondition(){
        System.out.println("printNameAndActivitiesWithCondition");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel()>3)
                c2.andThen(c3).accept(student);
        } );
    }


    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("Blessen");

        printName();
        printNameAndActivities();
        printNameAndActivitiesWithCondition();
    }
}
