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
//@DiscriminatorValue("F")  // this can be added in case of SINGLE_TABLE approach
@PrimaryKeyJoinColumn(name = "file_id") //this can be added in case of JOIN_TABLE approach
public class File extends Resource {

    private String fileType; //whether the file is PDF, DOC, etc.
}
