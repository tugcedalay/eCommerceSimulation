package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstratcs.UserService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService {
    
	private UserDao userDao;
	
	
	if(!user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
		
	}

	@Override
	public String reqister(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String verifyUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reqisterWithGoogleAccount(String googleEmail) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
