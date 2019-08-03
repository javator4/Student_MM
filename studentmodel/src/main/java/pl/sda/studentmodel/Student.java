package pl.sda.studentmodel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

    private String name;
    private String lastname;
    private Integer index;

    public Student(String name, String lastname, Integer index) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;
    }
}
