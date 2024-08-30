package eCommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users = new ArrayList<>();
	private long idCounter = 1L;
	
	@Override
	public void save(User user) {
		user.setId(idCounter++);
		user.add(user);

		
	}


	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public Optional<User> findByEmail(String Email) {
	
		return users.stream()
				.filter(user -> user.getEmail().equals(Email))
				.findFirst();
	}


	@Override
	public void update(User user) {
		users.replaceAll(u -> u.getId() == user.getId() ? user : u);
		
	}
    
}
