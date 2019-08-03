package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Student[] students =null;
        try {
            students = objectMapper.readValue(new File("list.json"), Student[].class );  //tworzy obiekt File, który wskazuje na list.json
            for (Student st: students) {
                System.out.println(st);
            }
        } catch (IOException e){
            e.printStackTrace();
        }






    }
}
