package in.dminc.repositories;

import in.dminc.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    // select * from author where first_name='ali';
    List<Author> findAllByFirstName(String firstName);

    // select * from author where lower(first_name) = 'ali';
    // select * from author where upper(first_name) = 'ALI';
    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    // select * from author where lower(first_name) = '%ali%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    // select * from author where lower(first_name) = 'ali%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    // select * from author where lower(first_name) = '%ali'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    // select * from author where first_name in ('Vishnu','Bovilla','Vardhan')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);


    // select * from author where last_name=''
    List<Author> findByLastName(String lastName);

    List<Author> findByFirstNameAndLastName(String firstName, String lastName);

    Optional<Author> findByEmail(String email);

    int countAllByAge(int age);

    void deleteAllByAge(int age);
}
