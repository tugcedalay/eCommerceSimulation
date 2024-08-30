package eCommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users = new ArrayList<User>();
	int idCounter;
	
	@Override
	public void add(User user) {
		user.setId(idCounter++);
		user.add(user);

		
	}


	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<User> findByEmail(String Email) {
	
		return Optional.empty();
	}
    
}
