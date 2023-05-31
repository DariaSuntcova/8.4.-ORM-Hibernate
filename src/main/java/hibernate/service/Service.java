package hibernate.service;

import hibernate.entity.Person;
import hibernate.repository.PersonRepository;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private final PersonRepository repository;

    public Service(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getAge(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getNameSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}
