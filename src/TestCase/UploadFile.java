package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestListners.ErrorUtil;

public class UploadFile {
	@Test(priority =1)
	public void UploadInServerTest(){
		System.out.println("FileUploadedInTheServer");
	}
	
	@Test(priority=2)
	public void ClearPE(){
		try{
		Assert.assertEquals("A", "B");
		}catch (Throwable t){
			System.out.println("Error");
			ErrorUtil.addVerificationFailure(t);
		}
		
		System.out.println("PostEngineCleared");
	
	

}
}