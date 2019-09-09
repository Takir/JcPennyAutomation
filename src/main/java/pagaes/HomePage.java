package pagaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.utility.Helper;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="xpath value") WebElement backToSchool;
	@FindBy(xpath="xpath value") WebElement jeansSubMenu;
	@FindBy(xpath="xpath value") WebElement uniformSubMenu;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void hoverOverOnBackToSchool() {
		//WebElement backToSchool=driver.findElement(By.id(""));
		Helper.mouseOver(driver, backToSchool);
	}
	public JeanPage clickOnJeans() {
		Helper.clickOnElement(jeansSubMenu);
		return new JeanPage(driver);
		}
	public UniformPage clickOnUniform() {
		Helper.clickOnElement(uniformSubMenu);
		return new UniformPage();
		}
}
