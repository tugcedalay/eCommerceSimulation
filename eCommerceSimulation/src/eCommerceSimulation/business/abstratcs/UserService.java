package eCommerceSimulation.business.abstratcs;

import eCommerceSimulation.entities.concretes.User;

public interface UserService {
    String reqister(User user);
    String verifyUser(String email);
    String loginUser(String email, String password);
    String reqisterWithGoogleAccount(String googleEmail);
}
