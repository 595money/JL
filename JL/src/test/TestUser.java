package test;

import domain.JLException;
import domain.User;

public class TestUser {
	
	public static void main(String[] args) throws JLException {
		User user1 = new User();
		
		user1.setId("1");
		
		user1.setName("2");
		
		user1.setPassWord("3");
		
		
		System.out.println(user1.toString());
	}

	
	

}
