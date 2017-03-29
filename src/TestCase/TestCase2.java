package TestCase;

import org.testng.annotations.Test;

public class TestCase2 {
	@Test(dataProviderClass=Data_Provider.class,dataProvider="RegisterCustomer")
	public void RegisterIndCustomer(String u,String p){
		System.out.println("This is open customer test");
	}

	@Test(dataProviderClass=Data_Provider.class,dataProvider="RegisterCustomer")
	public void RegisterCompanyCustomer(String u,String p,String q){
		System.out.println("This is open customer test");
	}
}
