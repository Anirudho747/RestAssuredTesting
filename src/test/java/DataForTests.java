import org.testng.annotations.DataProvider;

public class DataForTests {

	@DataProvider(name="anyName")
	public Object[][] dataCentre()
	{
	/*	Object[][] data = new Object[2][2];
		
		data[0][0] = "Albert";
		data[0][1] = "Einstein";
		
		data[1][0] = "Thomas";
		data[1][1] = "Alva Edison";
		
		return data;
	*/
		
		return new Object[][]
				{
			{"Graham", "Bell"},
			{"Henry","Ford"}
				};
	}

}
