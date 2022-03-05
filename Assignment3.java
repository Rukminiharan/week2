package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		WebElement elementEmail = driver.findElement(By.id("email"));
		elementEmail.sendKeys("kumar.testleaf@gmail.com");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("leaf@12");
		//WebElement elementLogin = driver.findElement (By.className ("btn btn-primary")); - Compound class name is not permitted
		//elementLogin.click();
		WebElement login =driver.findElement(By.xpath("//button[@type = 'submit']"));
		login.click();
		System.out.println("The Title is: "+driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
	}

}
