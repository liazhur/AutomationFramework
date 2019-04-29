package TestFramework;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SignUpFormTest extends SeleniumTest {

	@Test
	public void signUp() {
		driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

		SignUpPage signUpPage = new SignUpPage(driver);
//		assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
//		assertTrue(receiptPage.isInitialized());

		assertEquals("Thank you!", receiptPage.confirmationHeader());
	}

}
