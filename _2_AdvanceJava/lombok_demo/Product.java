package _2_AdvanceJava.lombok_demo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Product {

    private int id;
    private String name;
    private int price;
    private String mfYear;

}
