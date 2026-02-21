package _2_AdvanceJava.lombok_demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LombokDemo {

    int id;
    String name;
    int age;
}
