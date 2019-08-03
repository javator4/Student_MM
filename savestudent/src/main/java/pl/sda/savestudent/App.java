package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

         List<Student> studentList = new ArrayList<Student>(Arrays.asList(
                new Student("john", "jejson", 23),
                new Student("kuzyn", "cosiek", 45),
                new Student("laps", "nygus", 334)
        ));

        ObjectMapper objectMapper = new ObjectMapper();
        try{
            objectMapper.writeValue(new File("list.json"), studentList);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


}
