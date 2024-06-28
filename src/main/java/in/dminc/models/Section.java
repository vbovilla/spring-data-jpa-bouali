package in.dminc.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Section {

    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "section_sequence"
//    )
//    @SequenceGenerator(
//            name = "section_sequence", // name should be same as on the 'generator' in @GeneratedValue.
//            sequenceName = "section_seq",
//            allocationSize = 1
//    )
    @GeneratedValue
    private Integer id;
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
