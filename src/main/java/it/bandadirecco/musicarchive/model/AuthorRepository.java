package it.bandadirecco.musicarchive.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findByid(long id);

    List<Author> findByName(String name);

    List<Author> findByLastName(String lastName);

    List<Author> findByPseudonym(String pseudonym);

    List<Author> findAll();
}
