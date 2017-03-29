package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestListners.ErrorUtil;

public class AccountCreation {
	SoftAssert softAssert = new SoftAssert();
	@Test(priority=1,dataProviderClass=Data_Provider_ForAccount.class,dataProvider="LoginAdminTestData")
	public void LoginEbbs(String UserName,String Password){
		System.out.println("SystemLoggedInSuccesfully");
		try{
		Assert.assertEquals("MainPage", "Main1Page");
		}catch(Throwable t){
			ErrorUtil.addVerificationFailure(t);
			
	}
	}
	
	@Test(priority=2,dataProviderClass=Data_Provider_ForAccount.class,dataProvider="TestDataSheet_Accounts")
	public void CreateRel(String FullName,String DOB){
		
		System.out.println("RelCreatedSuccesFully");
	}
	
	@Test(priority=3,dataProviderClass=Data_Provider_ForAccount.class,dataProvider="TestDataSheet_Accounts")
	public void CreateMast(String RelNo,String SegMentCode){
		//Assert.fail("Hmmmm");
		try
		{
		Assert.assertEquals("B", "A");
		} catch(Throwable t)
		{
		ErrorUtil.addVerificationFailure(t);
		System.out.println("MasterCreate");
		}
	}
	
	@Test(priority=4,dataProviderClass=Data_Provider_ForAccount.class,dataProvider="TestDataSheet_Accounts")
	public void CreateAcct(String Masterno,String ProductCode){
		//throw new SkipException("mani skipped");
		System.out.println("AcctCreated");
	}
	
	
}
