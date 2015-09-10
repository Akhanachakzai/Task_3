package Uni;

public class Szabist extends Universities {
	protected String Dept,add;
	public Szabist(String uni)
	{
		super ("Szabist");
		Dept = uni ;
	}
	public void University(String uni)
	{
		 System.out.println("The name is "+uni);
	}
	public void address(String add)
	{
		System.out.println("address is "+add);
	}
	
}

