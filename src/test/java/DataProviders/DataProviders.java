package DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

	String username = "Chand-123";
	String password = "Chand@123";

	@DataProvider(name = "RegisterScenario")
	public Object[][] userNamePassword() {
		return new Object[][] { 
			{username, password} 
			};
	}

}
