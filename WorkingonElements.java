package workonElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingonElements {
	EdgeDriver driver;
	String url ="https://demo.guru99.com/v4/";
	public void invokeBrowser() {
		//this method invokes chrome browser
		System.setProperty("webdriver.edge.driver","C:\\Users\\Pranavi\\eclipse-workspace\\libs\\msedgedriver.exe");
		driver = new EdgeDriver();
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.get(url);
        
		
	}
	public void login(String Username , String Password) {
		WebElement UsernameElement = driver.findElement(By.name("uid"));
		UsernameElement.sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("btnLogin")).click();
	}
	public void addcustomer() {
		driver.findElement(By.linkText("New Customer")).click();
         driver.findElement(By.name("name")).sendKeys("jack");
         driver.findElement(By.xpath("//input[@value='f']")).click();
         driver.findElement(By.name("dob")).sendKeys("05/11/1999");
         driver.findElement(By.name("addr")).sendKeys("hyderabad");
         driver.findElement(By.name("city")).sendKeys("hyd");
         driver.findElement(By.name("state")).sendKeys("TG");
         driver.findElement(By.name("pinno")).sendKeys("500072");
         driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
         String emailid = "Test"+System.currentTimeMillis()+"@test.com";
        
         driver.findElement(By.name("emailid")).sendKeys(emailid);
         driver.findElement(By.name("password")).sendKeys("test123");
         driver.findElement(By.name("sub")).click();
        }

	public static void main(String[] args) {
		WorkingonElements WE = new WorkingonElements();
		WE.invokeBrowser();
		WE.login("mngr509389","ErusEbY");
		WE.addcustomer();

	}

}
