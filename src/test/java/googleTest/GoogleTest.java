package googleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void testGoogle(){

		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.google.co.in/?gfe_rd=cr&ei=btPxV6HVAY3y8Aeb8qW4Cw&gws_rd=");
	}
}
