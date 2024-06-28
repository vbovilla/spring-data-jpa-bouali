package in.dminc.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@Builder
@SuperBuilder
@Entity
public class Lecture extends BaseEntity {

//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "lecture_sequence"
//    )
//    @SequenceGenerator(
//            name = "lecture_sequence", // name should be same as on the 'generator' in @GeneratedValue.
//            sequenceName = "lecture_seq",
//            allocationSize = 1
//    )
//    @GeneratedValue
//    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(
            name = "resource_id"
    )
    private Resource resource;
}
