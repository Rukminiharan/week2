package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement (By.className ("decorativeSubmit"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement (By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement inputBox = driver.findElement(By.name("username"));
		inputBox.sendKeys("Demosalesmanager");
		WebElement td = driver.findElement(By.name("password"));
		td.sendKeys("crmsfa");
		WebElement elementloginButton = driver.findElement (By.className ("decorativeSubmit"));
		elementloginButton.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		driver.findElement(By.linkText("Create Lead"));
		
		}
		}
