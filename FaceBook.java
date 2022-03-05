package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement( By.linkText("Create New Account")).click();
		//driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));
		//driver.findElement(By.xpath("//a[contains (text(),'registration-form')]")
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		WebElement elementFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		elementFirstName.sendKeys("Ruks");
		WebElement elementLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		elementLastName.sendKeys("Kirths");
		WebElement elementMobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		elementMobileNumber.sendKeys("9629577312");
		WebElement elementNewPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		elementNewPassword.sendKeys("@Ruks1");
		WebElement dateDropDown = driver.findElement(By.id("day"));
		Select fbDate =new Select(dateDropDown);
		fbDate.selectByValue("2");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select fbMonth =new Select(monthDropDown);
		fbMonth.selectByIndex(11);
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select fbYear =new Select(yearDropDown);
		fbYear.selectByVisibleText("1991");

	}

}
