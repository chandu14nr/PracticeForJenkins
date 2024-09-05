package CreateContactTest;

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
		System.out.println("CreateContact with ph Test Executed");
	}
	

}
