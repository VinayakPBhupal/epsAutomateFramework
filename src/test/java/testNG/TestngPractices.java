package testNG;

import org.testng.annotations.Test;

public class TestngPractices {
	
	@Test(priority = -1)
	public void createCustomer() {
		
		System.out.println("customer created");
		
	}
	
	@Test(priority = 2)
	public void modifyCustomer() {
		
		System.out.println("customer modified");
		
	}
	
	@Test(priority = 1)
	public void deleteCustomer() {
		
		System.out.println("customer deleted");
		
	}

}
