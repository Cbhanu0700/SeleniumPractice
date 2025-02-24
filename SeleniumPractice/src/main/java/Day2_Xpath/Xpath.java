package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

				// TODO Auto-generated method stub

				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://selectorshub.com/xpath-practice-page/");
				//Absolute Xpath
				driver.findElement(
						By.xpath("/html/body/div[1]/main/div/div[1]/section[2]/div/div[1]/div/div[1]/div/div/label[1]/following-sibling::input[1]"))
						.sendKeys("Chandubhanuprakash123@gmail.com");
				
				//Attribute
				driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("Bhanu@08");
				//Relative Xpath
				//contains
				driver.findElement(By.xpath("//*[contains(@name,'company')]")).sendKeys("Aptean");
				//starts-with()
				driver.findElement(By.xpath("//*[starts-with(@type,'number')]")).sendKeys("9999999999");
				//text()
				String a=driver.findElement(By.xpath("//button[text()='Submit']")).getText();
				System.out.println(a);
				//partial relative Xpath
				//div/br[7]/following-sibling::input
				driver.findElement(By.xpath("//div/br[7]/following-sibling::input")).sendKeys("Lachimi");
				//AND
				driver.findElement(By.xpath("//input[@id='datepicker' and @class='hasDatepicker']")).clear();
				//or
				driver.findElement(By.xpath("//input[@id='datepicker' or @class='haspicker']")).sendKeys("LK");
				}

		}

	