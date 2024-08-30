package eCommerceSimulation.dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

import eCommerceSimulation.entities.concretes.User;

public interface UserDao {
    void save (User user);
    List<User> findAll();
    void update(User user);
    Optional<User> findByEmail(String Email);
}
