package TestCase;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	
	//DataProvider for TestCase1
	@DataProvider
	public static Object[][] LoginTestData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Supportm";
		data[0][1] = "scope2009";
		
		data[1][0] = "Supportc";
		data[1][1] = "Scope2009";
		return data;
	}
	
	//DataProvider for TestCase2
		@DataProvider(name="RegisterCustomer")
		public static Object[][] RegisterCustomerTestData(Method m){
			Object[][] data= null;
			if (m.getName().equals("RegisterIndCustomer")){
				data = new Object[2][2];
				data[0][0] = "fullname";
				data[0][1] = "mobileno";
				
				data[1][0] = "fullname";
				data[1][1] = "panno";
				
			}
			if (m.getName().equals("RegisterCompanyCustomer")){
				data = new Object[2][3];
				data[0][0] = "ABB";
				data[0][1] = "mobileno";
				data[0][2] = "tinNo";
						
				data[1][0] = "GE";
				data[1][1] = "officeno";
				data[1][2] = "tinNo";
				
			}
			return data;
			
					}
}
