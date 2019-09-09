package pom.utility;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	public static void mouseOver(WebDriver driver, WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).build().perform();
	}
	public static void clickOnElement(WebElement element) {
		//element.click();
		waitForElement(element).click();
	}
	public static WebElement waitForElement(WebElement element ) {
		//WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds)
		ExpectedConditions.invisibilityOf(element);
		return element; 
		
	}
	public static boolean verifyElement(WebElement element) {
		boolean result=waitForElement(element).isDisplayed();
		return result;
	}

}
