package Uni;

public abstract class Universities {
protected String Name ;
protected String Address;
public Universities(String name )
{
	Name = name;
}
public abstract void University(String uni);
public abstract void address(String add);
public String tostring()
{
	return Name;
}
}
