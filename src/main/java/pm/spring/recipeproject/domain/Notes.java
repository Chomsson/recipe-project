package pm.spring.recipeproject.domain;
/* created by PM
  at 13.11.2020 */

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String recipeNotes;

}
