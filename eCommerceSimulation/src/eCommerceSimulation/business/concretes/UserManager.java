package eCommerceSimulation.business.concretes;

import java.util.Optional;

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
        if(userDao.findByEmail(user.getEmail()).isPresent()) {
        	return "email already use in";
        }
        if(user.getPassword().length() < 6) {
        	return "password must be least 6 charecters";
        }
        
        if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
        	return "First name and last name must be at least 2 characters";
        }
          userDao.save(user);
          sendVerificationEmail(user);
        
        return "Registration successful";
    }

    

	@Override
    public String verifyUser(String email) {
        // Doğrulama mantığı burada yer alacak
		Optional<User> optionalUser = userDao.findByEmail(email);
		if(optionalUser.isPresent()) {
				User user = optionalUser.get();
		user.setVerified(true);
		userDao.update(user);
		
		return"Email verified successfully";
		
			
		}
		
        return "Verification successful";
    }

    @Override
    public String loginUser(String email, String password) {
        // Giriş mantığı burada yer alacak
    	Optional<User> optionalUser =userDao.findByEmail(email);
    	if(optionalUser.isPresent() && optionalUser.get().isVerified()) {
    		User user = optionalUser.get();
    		if(user.getPassword().equals(password)) {
    			return "Login successful";
    		}
    		
    		return "Invalid password";
    	}
        return "User not found or email not verified";
    }

    @Override
    public String reqisterWithGoogleAccount(String googleEmail) {
        // Google hesabı ile kayıt mantığı burada yer alacak
    	if(userDao.findByEmail(googleEmail).isPresent()) {
    		return "Registration with Google account successful";
    	}
    	 User user = new User(0, null, null, null, null);
         user.setEmail(googleEmail);
         user.setFirstName("GoogleUser");
         user.setLastName("GoogleUser");
         user.setPassword("");
         user.setVerified(true);
         
         
         userDao.save(user);
         return "Registered with Google account";
    }
    
      

    
    private void sendVerificationEmail(User user) {
		System.out.println("verification email sent to :" + user.getEmail());
		
	}
}
