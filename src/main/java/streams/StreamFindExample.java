package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.5)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.1)
                .findFirst();
    }

    public static void main(String[] args) {
        if(findAnyStudent().isPresent())
            System.out.println("Found the student: "+findAnyStudent().get());
        else
            System.out.println("Not found");

        if(findFirstStudent().isPresent())
            System.out.println("Found the student: "+findFirstStudent().get());
        else
            System.out.println("Not found");
    }

}
