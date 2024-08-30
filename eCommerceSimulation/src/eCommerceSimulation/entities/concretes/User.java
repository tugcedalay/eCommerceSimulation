package eCommerceSimulation.entities.concretes;

import eCommerceSimulation.entities.abstracts.Entity;

public class User implements Entity {
    private long id;
    private String lastName;
    private String firstName;
    private String email;
    private String password;
	private String user;
	private boolean verified = false;
	public User(int id, String lastName, String firstName, String email, String password) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long idCounter) {
		this.id = (int) idCounter;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void add(User user) {
        		
	}
	public void setVerified(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public boolean isVerified() {
		// TODO Auto-generated method stub
		return false;
	}
    
}
