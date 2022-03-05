package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathPractise {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id = 'username']"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.xpath("//input[@id = 'password']"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement(By.xpath("//input[@class ='decorativeSubmit']"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement (By.xpath("//a[contains(text(),'CRM/SFA']"));
		elementCRMSFA.click();
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Rukmini");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Testleaf");

	}

}
