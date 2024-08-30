package eCommerceSimulation.business.abstratcs;

import eCommerceSimulation.entities.concretes.User;

public interface UserService {
    void add (User user);
    void logIn(User user);
}
