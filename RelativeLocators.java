import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement email=driver.findElement(By.name("email"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(email)).getText());
       driver.findElement(with(By.tagName("input")).below(email)).sendKeys("Advatix@123");

//System.out.println(driver.findElement(By.id("exampleInputPassword1")).getDomAttribute("placeholder"));
WebElement checkBoxLabel=driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxLabel)).click();
WebElement RadioButtonLabel=driver.findElement(By.xpath("//label[text()='Student']"));
driver.findElement(with(By.tagName("input")).toRightOf(RadioButtonLabel)).click();
WebElement dobLabel=driver.findElement(By.xpath("//label[text()='Date of Birth']"));
driver.findElement(with(By.tagName("input")).near(dobLabel)).sendKeys("14/10/2024");




		
	
	}

}
