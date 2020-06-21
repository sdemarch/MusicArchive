package it.bandadirecco.musicarchive.model.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByid(long id);

    User findByUserName(String username);

    User findByUserNameAndPassword(String username, String password);

    List<User> findAll();
}
