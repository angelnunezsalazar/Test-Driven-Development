package unittests;

import static org.junit.Assert.*;
import model.Account;
import org.junit.Test;

public class AccountTests {

	@Test
	public void createNew() throws Exception {
		Account account=new Account();
		String returnCode=account.create("luis", "p@ss0123");
		assertEquals("Account Created", returnCode);
		
	}
	
	@Test
	public void logInWithValidPassword() throws Exception {
		Account account=new Account();
		account.create("luis", "p@ss0123");
		
		boolean logIn=account.logIn("luis", "p@ss0123");
		
		assertEquals(true,logIn);
		
	}
	
	@Test
	public void cantLogInWithInvalidPassword() throws Exception {
		Account account=new Account();
		account.create("luis", "p@ss0123");
		
		boolean logIn=account.logIn("luis", "pass");
		
		assertEquals(false,logIn);
	}
	
	@Test
	public void cantLogInWithInvalidUser() throws Exception {
		Account account=new Account();
		account.create("luis", "p@ss123");
		
		boolean logIn=account.logIn("miguel", "p@ss123");
		
		assertEquals(false,logIn);
	}
	
}
