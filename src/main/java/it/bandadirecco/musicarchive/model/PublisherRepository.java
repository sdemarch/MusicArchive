package it.bandadirecco.musicarchive.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    Publisher findByid(long id);

    List<Publisher> findAll();
}
