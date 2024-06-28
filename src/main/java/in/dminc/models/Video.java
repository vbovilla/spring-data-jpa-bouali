package in.dminc.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
//@DiscriminatorValue("V")  // this can be added in case of SINGLE_TABLE approach
@PrimaryKeyJoinColumn(name = "video_id") //this can be added in case of JOIN_TABLE approach
public class Video extends Resource{

    private int length; //length of the video
}
