package in.dminc;

import in.dminc.models.Author;
import in.dminc.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringDataJpaBoualiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaBoualiApplication.class, args);
    }

	@Bean
    public CommandLineRunner init(AuthorRepository authorRepository) {
        return args -> {
            Author author = Author.builder()
                    .firstName("Vishnu")
                    .lastName("Bovilla")
                    .age(36)
                    .email("vbovilla@dminc.com")
                    .createdAt(LocalDateTime.now())
                    .lastModifiedAt(LocalDateTime.now())
                    .build();

            authorRepository.save(author);
        };
    }

}
