package tests;


import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import pages.RegistrationPage;

public class RegistrationTest extends TestBase{

	RegistrationPage rp ;
	String firstname = "Tom";
	String lastname = "Swear";
	String email = "test.myppaz998125@gmail.com";
	String pwd = "123456Ab.";



	@Test
	void Registration() throws InterruptedException
	{
		rp = new RegistrationPage(driver);
		rp.createAccount();
		rp.SetFirstname(firstname);
		rp.SetLastname(lastname);
		rp.SetEmail(email);
		rp.SetPassword(pwd);
		rp.PasswordConfirm(pwd);
		rp.Submit();
		AssertJUnit.assertEquals("My Account", driver.findElement(By.className("base")).getText());
		rp.AccountSelect();
		rp.Signout();
	}
}
