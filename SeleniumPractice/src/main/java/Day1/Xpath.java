package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://selectorshub.com/xpath-practice-page/");
				driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("chandubhanuprakash123@gmail.com");
				//Absolute Xpath
			//	/html/body/div[1]/section/div[1]/div
				/*Relative Xpath
				
				Contains()
				starts-with()
				text()
				*/
				//Contains()
				driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Bhanu@02");
			//Starts-with()
				driver.findElement(By.xpath("//input[starts-with(@name,'company')]")).sendKeys("Aptean");
				//text()
				driver.findElement(By.xpath("//input[@name='mobile number']")).sendKeys("9999999999");
				String A=driver.findElement(By.xpath("//button[text()='Submit']")).getText();
				System.out.println(A);
			
	}

}
