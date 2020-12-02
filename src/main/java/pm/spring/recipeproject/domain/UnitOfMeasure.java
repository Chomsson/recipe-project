package pm.spring.recipeproject.domain;

import lombok.*;

import javax.persistence.*;

/* created by PM
  at 15.11.2020 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    @OneToOne
    private Ingredient ingredient;

}
