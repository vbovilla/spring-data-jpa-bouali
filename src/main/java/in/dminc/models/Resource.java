package in.dminc.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Resource {

    @Id
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "resource_sequence"
//    )
//    @SequenceGenerator(
//            name = "resource_sequence", // name should be same as on the 'generator' in @GeneratedValue.
//            sequenceName = "resource_seq",
//            allocationSize = 1
//    )
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer size;
    private String url;

    @OneToOne
    @JoinColumn(
            name = "lecture_id"
    )
    private Lecture lecture;
}
