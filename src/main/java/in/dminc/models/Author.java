package in.dminc.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@Builder
@SuperBuilder
@Entity
//@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {

//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "author_sequence"
//    )
//    @SequenceGenerator(
//            name = "author_sequence", // name should be same as on the 'generator' in @GeneratedValue.
//            sequenceName = "author_seq",
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
    // when we do not specify id generator type,
    // Spring JPA use GenerationType.AUTO, which will use one of SEQUENCE, TABLE, etc. based on the underlying database.
//    @GeneratedValue
//    private Integer id;

    @Column(
            name = "first_name"
    )
    private String firstName;
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private Integer age;
    // commented createdAt, and lastModifiedAt properties/columns, since we have the same in BaseEntity.
//    @Column(
//            updatable = false,
//            nullable = false
//    )
//    private LocalDateTime createdAt;

//    @Column(
//            insertable = false
//    )
//    private LocalDateTime lastModifiedAt;

    @ManyToMany(
            mappedBy = "authors"
    )
    private List<Course> courses;
}
