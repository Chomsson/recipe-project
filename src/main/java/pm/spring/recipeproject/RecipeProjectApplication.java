package pm.spring.recipeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan(value = "pm.spring.recipeproject.domain")
@SpringBootApplication
public class RecipeProjectApplication {


    public static void main(String[] args) {
        SpringApplication.run(RecipeProjectApplication.class, args);
    }

}
