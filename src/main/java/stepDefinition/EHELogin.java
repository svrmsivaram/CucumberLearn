/**
 * 
 */
package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author sivaram
 *
 */
public class EHELogin {
	public static RemoteWebDriver driver;
	
	public EHELogin(){
		
		PageFactory.initElements(driver, this);
	}
	
	@Given ("Launch the browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@And ("Load the URL")
	public void loadURL(){
		driver.get("https://qa.cloud.ehe.health/#/");
	}

	@And ("Maximize the window")
	public void maximizeWindow(){
		driver.manage().window().maximize();
	}

	@And ("Set the Session Timeout")
	public void setTimeOut(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@When ("Enter the userName as (.*)")
	public void enterUserName(String userName){
		driver.findElement(By.xpath("//div/input[@formcontrolname ='email']")).clear();
		driver.findElement(By.xpath("//div/input[@formcontrolname ='email']")).sendKeys(userName);
	}

	
	@And ("Enter the Password as (.*)")
	public void enterPassword(String passWord){
		driver.findElement(By.xpath("//div/input[@formcontrolname ='password']")).clear();
		driver.findElement(By.xpath("//div/input[@formcontrolname ='password']")).sendKeys(passWord);
		
	}
	
	
	//@FindBy(id="username") WebElement Usernameyml;
/*	@When ("Enter the userName")
	public void enterUserName(){
		Username.sendKeys(getymldata.get("username"));
	}

	//@FindBy(id="password") WebElement Password;
	@And ("Enter the Password")
	public void enterPassword(){
		Password.sendKeys(getymldata.get("password"));
	}
*/
	
	@Then("Click on the Login Button")
	public void clickLoginButton(){
		driver.findElement(By.xpath("//button/span/span[text()='Sign In']")).click();
	}
	
	
	
}
