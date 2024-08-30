package eCommerceSimulation;

import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.dataAccess.concretes.HibernateUserDao;
import eCommerceSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new HibernateUserDao());
		
		
		//kullanıcı kaydı
		User user1 = new User(0, null, null, null, null);
		user1.setFirstName("Tyler");
        user1.setLastName("Durden");
        user1.setEmail("durden.tyler@example.com");
        user1.setPassword("pasword123");
        
        System.out.println(userManager.reqister(user1));
        
        //kullanıcı dogrulama
        System.out.println(userManager.verifyUser("durden.tyler@example.com")); // "Registration successful, please verify your email"
        
        //giriş yapma
        System.out.println(userManager.loginUser("durden.tyler@example.com", "pasword123")); // "Login successful"
        
        
        //google ile kayit
        System.out.println(userManager.reqisterWithGoogleAccount("tyler.google@example.com"));  // "Registered with Google account"
	}

}
