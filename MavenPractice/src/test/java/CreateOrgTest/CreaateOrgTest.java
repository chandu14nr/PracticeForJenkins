package CreateOrgTest;

import org.testng.annotations.Test;

public class CreaateOrgTest {

	@Test
	public void CreateOrTest()
	{
		System.out.println("CreateOrTest Executed");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

	}
	
	@Test
	
	public void CreateOrgWithDateTest()
	{
		System.out.println("CreateOrgWithDateTest Executed");
	}
}
