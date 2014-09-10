package Test1;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAnt {
	WebDriver driver;



	@Test
	public void test() {
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
