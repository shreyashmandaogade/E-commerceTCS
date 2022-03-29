package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.LoginPage;
import com.pages.RegisterPage;

public class TC_Register_Test_02 extends BaseClass{

	@Test
	public void addNewCustomer() throws Exception{

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Log.info("User name is provided");

		lp.setPassword(password);
		Log.info("Password is provided");
		lp.clickSubmit();

		Thread.sleep(2000);

		RegisterPage dp = new RegisterPage(driver);

		dp.custUserName("Shreyash");
		dp.custLastName("Madaogade");		
		dp.custEmailId("Shreyash@gmail.com");
		dp.custMobile("1020304050");
		dp.custPassword("246sdm");
		dp.custConfPassword("246sdm");

		Thread.sleep(2000);
		dp.custRole();
		dp.custAddress("Moti Nagar");
		
		dp.custgender("MALE");
		dp.custState("Maharashtra");
		
		dp.custCity("Pusad");

		Thread.sleep(2000);

		dp.clickSubt();

		Thread.sleep(4000);

		if(isAlertPresent() == true) {
			driver.switchTo().alert().accept();
			Assert.assertTrue(true);
			Log.info("Customer added Successfully");
		}
		else {
			Assert.assertTrue(false);
			Log.info("Customer not added");
		}
	}	

	public boolean isAlertPresent() {

		try {
			driver.switchTo().alert();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}

