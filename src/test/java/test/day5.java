package test;

import org.testng.annotations.Test;

public class day5 {

	
	@Test(groups={"Smoke"})
	public void grouprun()
	{
		System.out.println("Grpoup");
	}
	
    @Test
	public void grouprun2()
	{
		System.out.println("Grpoup2");
	}
	
	
	
}
