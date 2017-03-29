package TestCase;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test(dataProviderClass=Data_Provider.class,dataProvider = "LoginTestData")
	public void login(String UserName,String Password){
		System.out.println("This is login test");
	}

}
