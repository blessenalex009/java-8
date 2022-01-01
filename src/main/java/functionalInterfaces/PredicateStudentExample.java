package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> p2 = student -> student.getGpa()>=3.5;

    public static void getStudentsByGradeLevel(){
        System.out.println("getStudentsByGradeLevel:");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student))
                System.out.println(student);
        });
    }

    public static void getStudentsByGpa(){
        System.out.println("getStudentsByGpa:");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student))
                System.out.println(student);
        });
    }
    public static void filterStudents(){
        System.out.println("filterStudents:");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student))
                System.out.println(student);
        });
    }

    public static void main(String[] args) {
        getStudentsByGradeLevel();
        getStudentsByGpa();
        filterStudents();

    }
}
