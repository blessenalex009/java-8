package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static Double avg(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Sum of notebooks: "+sum());
        System.out.println("Avg of notebooks: "+avg());
    }
}
