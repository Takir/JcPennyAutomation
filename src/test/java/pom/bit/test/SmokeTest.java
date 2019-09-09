package pom.bit.test;

import org.junit.Test;

import pagaes.HomePage;
import pagaes.JeanPage;
import pagaes.MenJeanPage;
import pagaes.MenJeanProduct;

public class SmokeTest extends BaseTest {
	HomePage homePage;
	MenJeanPage menJeanPage;
	JeanPage jeanPage;
	MenJeanProduct menJeanProduct;
	@Test
	public void buyJeansPant() {
		homePage = new HomePage(driver);
		homePage.hoverOverOnBackToSchool();
		jeanPage=homePage.clickOnJeans();
		jeanPage.verifyDiscountBannar();
		menJeanPage=jeanPage.clickMenJean();
		menJeanProduct = menJeanPage.clickOnMenJeanProduct();
		
	}

}
