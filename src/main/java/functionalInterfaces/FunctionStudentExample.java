package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> listMapFunction = studentList -> {

        Map<String, Double> map = new HashMap<>();

        studentList.forEach(student -> {
            if(PredicateStudentExample.p1.test(student))
             map.put(student.getName(), student.getGpa());

        });

        return map;

    };

    public static void main(String[] args) {
        System.out.println(listMapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
