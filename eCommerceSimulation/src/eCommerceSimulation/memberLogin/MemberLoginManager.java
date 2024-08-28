package eCommerceSimulation.memberLogin;

import eCommerceSimulation.entities.concretes.User;

public class MemberLoginManager {
	 public void log(User user) {
     	System.out.println("Google hesabı ile üye olundu"+user.getFirstName());
     }
}