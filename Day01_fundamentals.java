package Introtoselenium;
import org.openqa.selenium.edge.EdgeDriver;

public class Day01_fundamentals {
		EdgeDriver driver;
		//can import the libraries that are necessary to work with chrome driver
		//creating instance called driver
		String url ="http://qatechhub.com";
		public void invokeBrowser() {
			//this method invokes chrome browser
			System.setProperty("webdriver.edge.driver","C:\\Users\\Pranavi\\eclipse-workspace\\libs\\msedgedriver.exe");
			driver = new EdgeDriver();
            driver.manage().window().maximize();
			driver.get(url);
			//<title>QA Automation Tools Trainings and Tutorials | QA Tech Hub</title>
			verifyTitle();
			driver.get("https://www.facebook.com");
			driver.navigate().back();
			String CurrentUrl = driver.getCurrentUrl();
			System.out.println(CurrentUrl);
			driver.navigate().refresh();
		}
		public void closeBrowser() {
			driver.quit();//closes all the windows
			//driver.close(); //closes current active window
		}
		public void  verifyTitle(){
		    String expectedTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		    String actualTitle = driver.getTitle();

		    if (actualTitle.equals(expectedTitle)) {
		        System.out.println("PASS");
		    } else {
		        System.out.println("FAIL");
		    }
		}


		public static void main(String[] args) {
			
			Day01_fundamentals df = new Day01_fundamentals();
			df.invokeBrowser();
			df.closeBrowser();
		}

}