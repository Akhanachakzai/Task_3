package Uni;

public class Student extends Department {
protected String name;
protected int Reg;
public Student(String _name, int _Reg, String dept)
{
	super(dept);
	
	name =_name;
	Reg = _Reg;
}
}
