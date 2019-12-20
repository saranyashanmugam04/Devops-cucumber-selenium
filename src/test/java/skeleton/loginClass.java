package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class loginClass {
	WebDriver driver;
	@Given("user should launch chrome and application")
	public void user_should_launch_chrome_and_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
	    
	}

	@Given("user should enter un and psd")
	public void user_should_enter_un_and_psd() {
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@Given("user should click on login")
	public void user_should_click_on_login() {
	 driver.findElement(By.name("login")).click();
	}

	@Given("user should close the page")
	public void user_should_close_the_page() {
	    driver.close();
	}

}
