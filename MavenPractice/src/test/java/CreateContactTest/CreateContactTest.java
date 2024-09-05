package CreateContactTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public void CreateConTest()
	{
		System.out.println("CreateContactTest Executed");
		String ENVIRONMENT=System.getProperty("Environment");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(ENVIRONMENT);
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	@Test
	public void CreateConWithPhTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		List<WebElement> pro = driver.findElements(By.xpath("//div[@class='table-head']/following-sibling::div[@class=\"table-body\"]/descendant::p[@class='name' ]"));
		for (int i = 0; i <5; i++)
		{
			String text=pro.get(i).getText();
			System.out.print(text+" ");
			List<WebElement> wid = driver.findElements(By.xpath("//p[text()='"+text+"']/ancestor::div[@class='row-head']/div[@class='table-data form']//p"));
			for (int j = 0; j <5; j++)
			{
				String text1=wid.get(j).getText();
				System.out.print(text1);
			}
			System.out.println();
		}
		driver.quit();
	
		System.out.println("CreateContact with ph Test Executed");
	}
	

}
