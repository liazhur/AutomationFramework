package TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage extends PageObject {

	@FindBy(tagName = "h1")
	private WebElement header;

	public ReceiptPage(WebDriver driver) {
		super(driver);
	}

	public String confirmationHeader() {
		return header.getText();
	}
}
