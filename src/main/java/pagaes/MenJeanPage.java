package pagaes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.utility.Helper;

public class MenJeanPage {
	WebDriver driver;
	public MenJeanPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="") WebElement menJeanProduct;
	@FindBy(xpath="") WebElement color;
	
//	public void selectClolor() {
//		Helper.clickOnElement(color);
//	}
//	public void selectSize() {
//		Helper.
//	}
	
	public MenJeanProduct clickOnMenJeanProduct() {
		Helper.clickOnElement(menJeanProduct);
		return new MenJeanProduct();
	}

}
