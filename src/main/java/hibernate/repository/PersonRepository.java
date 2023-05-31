package hibernate.repository;

import hibernate.entity.Person;
import hibernate.entity.PersonPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface PersonRepository extends JpaRepository<Person, PersonPK> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);


}
