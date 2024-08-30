package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstratcs.UserService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService {
    
    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String reqister(User user) {
        // Email formatını kontrol ediyoruz
        if (!user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return "Invalid email format";
        }
        
        // Diğer iş mantığı burada
        
        
        
        
        return "Registration successful";
    }

    @Override
    public String verifyUser(String email) {
        // Doğrulama mantığı burada yer alacak
        return "Verification successful";
    }

    @Override
    public String loginUser(String email, String password) {
        // Giriş mantığı burada yer alacak
        return "Login successful";
    }

    @Override
    public String reqisterWithGoogleAccount(String googleEmail) {
        // Google hesabı ile kayıt mantığı burada yer alacak
        return "Registration with Google account successful";
    }
}
