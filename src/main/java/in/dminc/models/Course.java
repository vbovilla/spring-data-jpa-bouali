package in.dminc.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Course {

    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "course_sequence"
//    )
//    @SequenceGenerator(
//            name = "course_sequence", // name should be same as on the 'generator' in @GeneratedValue.
//            sequenceName = "course_seq",
//            allocationSize = 1
//    )
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    // owner of ManyToMany relationship between Course & Author
    @ManyToMany
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(
            mappedBy = "course"
    )
    private List<Section> sections;
}
