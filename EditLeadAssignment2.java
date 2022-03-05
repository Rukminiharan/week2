package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment2 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rukmini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rukmini");
		WebElement elementDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(elementDropdown);
		dd.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Functional Analyst, Retail");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rukminiharan@gmail.com");
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(stateDropdown);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); -if necessary use at the begining
		Thread.sleep(2000);
		//WebElement  elementEditButton = driver.findElement(By.xpath("(//a[@class='subMenuButton']/following-sibling::a)[2]"));
		//elementEditButton.click();
		driver.findElement( By.linkText("Edit")).click();
		//driver.findElement(By.id("ext-gen19")).click(); - as id has dynamic numbers it cannot be used
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Clears the entered text in the description field
		//driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Analyst, Retail");-can this code be used to enter
		//values in the description field again?
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Looking for a switch over");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Title is: "+driver.getTitle());
		
		
		

}

}
