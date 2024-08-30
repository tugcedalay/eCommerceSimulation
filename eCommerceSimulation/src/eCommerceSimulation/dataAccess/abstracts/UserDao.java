package eCommerceSimulation.dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

import eCommerceSimulation.entities.concretes.User;

public interface UserDao {
    void add (User user);
    List<User> getAll();
    void save(User user);
    Optional<User> findByEmail(String Email);
}
