package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {

    public static Map<String, List<Student>> groupingBy(){
       return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> customizedGroupingBy(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static void main(String[] args) {
//        System.out.println(groupingBy());
        System.out.println(customizedGroupingBy());

    }
}
