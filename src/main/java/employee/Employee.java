package employee;

public abstract class Employee
{
	private String name, phone;
	
	public Employee() {}
	public Employee(String name, String phone)
	{ 
		this.name = name;
		this.phone = phone;
	}

	public final String getName()
	{ 
		return name;
	}
	  
	public final String getPhoneNumber()
	{
		return phone;
	}
	  
	public String toString()
	{
		return name + " Phone: " + phone;
	}
		
	public abstract double salaryPay();
}