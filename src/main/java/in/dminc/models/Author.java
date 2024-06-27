package in.dminc.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Author {

    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "author_sequence"
//    )
//    @SequenceGenerator(
//            name = "author_sequence", // name should be same as on the 'generator' in @GeneratedValue.
//            sequenceName = "author_sequence",
//            allocationSize = 1
//    )

//    @GeneratedValue(
//            strategy = GenerationType.TABLE,
//            generator = "author_id_gen"
//    )
//    @TableGenerator(
//            name = "author_id_gen",  // name should be same as on the 'generator' in @GeneratedValue.
//            table = "author_id_generator",
//            pkColumnName = "id_name",
//            valueColumnName = "id_value",
//            allocationSize = 1
//    )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

}
