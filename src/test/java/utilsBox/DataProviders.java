package utilsBox;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "loginData")
	public String[] loginData() {
		String[] login_Data = { "jontyFergurson@gmx.com", "JT7_%eZ>AHV", "anacooonda@outlook.co", "Testing1234" };
		return login_Data;
	}
}
