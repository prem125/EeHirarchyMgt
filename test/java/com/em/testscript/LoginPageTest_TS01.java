package com.em.testscript;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.em.genericlib.GetData;
import com.em.pagerepo.LoginPage;
import com.em.testconfig.TestConfiguration;

public class LoginPageTest_TS01 extends TestConfiguration {
	GetData readexcel = new GetData();

	@Test(groups="Smoke")
	public void verifyLoginWithValidUserAndPassword_TC01() {
		LoginPage lp = new LoginPage(driver);

		String userName = readexcel.fromExcel("./test_data/data.xlsx", "Sheet1", 1, 0);
		String password = readexcel.fromExcel("./test_data/data.xlsx", "Sheet1", 1, 1);
		lp.LoginSuccessful(userName, password);

	}
	@Test(groups="Regression")
	public void verifyLoginWithValidUserAndPassword_TC02() {
		LoginPage lp = new LoginPage(driver);

		String userName = readexcel.fromExcel("./test_data/data.xlsx", "Sheet1", 1, 0);
		String password = readexcel.fromExcel("./test_data/data.xlsx", "Sheet1", 1, 1);
		lp.LoginSuccessful(userName, password);

	}

}
