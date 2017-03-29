package TestCase;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider_ForAccount {
	
	@DataProvider(name="TestDataSheet_Accounts")
	public static Object[][] getData(Method m){
		Object[][] data = null;
		if (m.getName().equals("LoginEbbs")){
			data = new Object[2][2];
			data[0][0]="U1";
			data[0][1]="U1";
			
			data[1][0]="U1";
			data[1][1]="U1";
		}
		if (m.getName().equals("CreateRel")){
			data = new Object[2][2];
			data[0][0]="FullName1";
			data[0][1]="LastName1";
			
			data[1][0]="FullName2";
			data[1][1]="lastName2";
		}
		if (m.getName().equals("CreateMast")){
			data = new Object[2][2];
			data[0][0]="Rel1";
			data[0][1]="Seg1";
			
			data[1][0]="Rel2";
			data[1][1]="Seg2";
		}
		if (m.getName().equals("CreateAcct")){
			data = new Object[2][2];
			data[0][0]="Mast1";
			data[0][1]="Prd1";
			
			data[1][0]="Mast2";
			data[1][1]="Prd2";
		}
		return data;
	}

	@DataProvider(name = "LoginAdminTestData")
	public static Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "AdminUser1";
		data[0][1] = "PassWord";
		
		data[1][0] = "AdminUser2";
		data[1][1] = "PassWord";
		return data;
	}
}
