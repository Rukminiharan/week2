package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAssignment3 {
	public static void main(String[] args) {
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
	WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_firstName"));
	elementCompanyName.sendKeys("Rukmini");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Akhila");
	WebElement elementDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd = new Select(elementDropdown);
	dd.selectByVisibleText("Employee");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Functional Analyst, Retail");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akhilaharan@gmail.com");
	WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd1 = new Select(stateDropdown);
	dd1.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	WebElement elementDuplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
	elementDuplicateLead.click();
	WebElement elementCompanyNameClear = driver.findElement(By.id("createLeadForm_companyName"));
	elementCompanyNameClear.clear();
	WebElement  elementCompanyNewname = driver.findElement( By.id("createLeadForm_companyName"));
	elementCompanyNewname.sendKeys( "Amazon");
	
	WebElement  elementFirstNameClear = driver.findElement( By.id("createLeadForm_firstName"));
	elementFirstNameClear.clear();
	WebElement  elementNewFirstName = driver.findElement( By.id("createLeadForm_firstName"));
	elementNewFirstName.sendKeys( "Shrinika");
	
	WebElement  elementupdate = driver.findElement( By.name( "submitButton"));
	elementupdate.click();
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println("The Title is: "+driver.getTitle());
	
	
}

}
