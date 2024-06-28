package in.dminc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@Builder
@SuperBuilder
@Entity
public class Section extends BaseEntity {

//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "section_sequence"
//    )
//    @SequenceGenerator(
//            name = "section_sequence", // name should be same as on the 'generator' in @GeneratedValue.
//            sequenceName = "section_seq",
//            allocationSize = 1
//    )
//    @GeneratedValue
//    private Integer id;
    private String name;
    private Integer sectionOrder;

    @ManyToOne
    @JoinColumn(
            name = "course_id"
    )
    private Course course;

    @OneToMany(
            mappedBy = "section"
    )
    private List<Lecture> lectures;
}
