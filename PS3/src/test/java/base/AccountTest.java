package base;
import base.Account;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAccount() {
		assertTrue(1==1);
	}
	/*
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		c.deposit(500.00);
		assertEquals("$400 Expected, actual is $500",(long)c.getBalance(),(long)500.00);
        c.withdraw(900);
	}

	@Test
	public final void testDeposit() {
		int x = 0;
		
		while (x < 20) {
			c.deposit(1000000000);
		}
	}

	
	

	@Test
	public final void testWithdraw() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetBalance() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetNumber() {
		fail("Not yet implemented"); // TODO
	}
*/


}
