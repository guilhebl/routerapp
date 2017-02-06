package sample.test.coverage;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

	/**
	 * Tests set and get
	 */
	@Test	
	public void testUserGettersAndSetters() {
		User user = new User("joe");
		user.setName("");
		Assert.assertTrue(user.getName().equals(""));
		
		user.setName(null);
		Assert.assertTrue(user.getName() == null);
		
		user.setName("java");
		Assert.assertTrue(user.getName().equals("java"));				
	}

	@Test
	public void testUserIsValid() {
		User user = new User("joe smith");		
		Assert.assertTrue(user.isValid());		
	}

	/**
	 * Tests user name null
	 */
	@Test	
	public void testUserNameNull() {
		User user = new User(null);		
		Assert.assertTrue(!user.isValid());		
	}

	/**
	 * Tests user name empty
	 */
	@Test	
	public void testUserNameEmpty() {
		User user = new User("");		
		Assert.assertTrue(!user.isValid());		
	}

	/**
	 * Tests user name too Long
	 */
	@Test	
	public void testUserInavlidNameTooLong() {
		User user = new User("joe the world wide clock field service man");		
		Assert.assertTrue(!user.isValid());		
	}

}
