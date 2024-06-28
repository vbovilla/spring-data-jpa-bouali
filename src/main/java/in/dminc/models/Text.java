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
//@DiscriminatorValue("T")  // this can be added in case of SINGLE_TABLE approach
@PrimaryKeyJoinColumn(name = "text_id") //this can be added in case of JOIN_TABLE approach
public class Text extends Resource {

    private String content;
}
