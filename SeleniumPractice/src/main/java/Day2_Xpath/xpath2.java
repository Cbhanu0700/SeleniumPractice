package Day2_Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//following
driver.findElement(By.xpath("//label[normalize-space()='First Name']//following::input[1]")).sendKeys("Bhanu");
//child
driver.findElement(By.xpath("//div[@class='container']//child::input[2]")).sendKeys("Prakash");
//descendent
driver.findElement(By.xpath("//div[@class='container']//descendant::input[3]")).sendKeys("chandu12@gmail.com");
//Preceding
driver.findElement(By.xpath("//label[@for='psw-repeat']//preceding::input[1]")).sendKeys("Bhanu@02");
//following-sibiling
driver.findElement(By.xpath("//input[@type='text']/following-sibling::input[2]")).sendKeys("Bhanu@02");
//Preceding-sibiling
driver.findElement(By.xpath("//button[@class='btn']/preceding-sibling::button")).click();
	}

}
