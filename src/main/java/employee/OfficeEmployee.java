package employee;

import java.text.DecimalFormat;

public class OfficeEmployee extends Employee{
	
	private double hourlyRate;
	public OfficeEmployee(String name, String phone, double hourlyRate)
	{ 
		super(name, phone);
		this.setHourlyRate(hourlyRate);
	}
	@Override
	public double salaryPay() {
		return hourlyRate*30*8;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public String toString()
	{
		String commonInfo = super.toString();
		return commonInfo + " Office Employee Salary: $" + 
			(new DecimalFormat("0.00")).format(salaryPay());
	}
}
