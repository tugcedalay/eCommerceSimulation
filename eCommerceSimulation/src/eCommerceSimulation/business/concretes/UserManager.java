package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstratcs.UserService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService {
    
	private UserDao userDao;
	
	public void UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	
	@Override
	public void add(User user) {
		
		}



	@Override
	public void logIn(User user) {
		// TODO Auto-generated method stub
		
	}
		

}
