package com.CRUDPStmnt.model;

public class Employee
{
  
	private int IdEmployee;
	private String NameEmployee;
	private int AgeEmployee;
	private String AdressEmployee;
	private double SalaryEmployee;
	private String DepartmentEmployee;
	
	//constructor methods
	public Employee()
	{
	}
	/**
	 * Parametrized constructor
	 * @param IdEmployee
	 * @param NameEmployee
	 * @param AgeEmployee
	 * 
	 * @param SalaryEmployee
	 * @param AdressEmployee 
	 * @param DepartmentEmployee
	 * @param AdressEmployee 
	 * 
	 * @return no values returned
	 */
	public Employee(int IdEmployee, String NameEmployee, int AgeEmployee, double SalaryEmployee, String DepartmentEmployee, String AdressEmployee)
	{
		this.IdEmployee = IdEmployee;
		this.NameEmployee = NameEmployee;
		this.AgeEmployee = AgeEmployee;
		this.AdressEmployee = AdressEmployee;
		this.SalaryEmployee = SalaryEmployee;
		this.DepartmentEmployee = DepartmentEmployee;
		
	}
	
	//getters and setters
	
	public int getIdEmployee() 
	{
		return IdEmployee;
	}
	public void setIdEmployee(int idEmployee) 
	{
		IdEmployee = idEmployee;
	}
	public String getNameEmployee()
	{
		return NameEmployee;
	}
	public void setNameEmployee(String nameEmployee) 
	{
		NameEmployee = nameEmployee;
	}
	public int getAgeEmployee() 
	{
		return AgeEmployee;
	}
	public void setAgeEmployee(int ageEmployee) 
	{
		AgeEmployee = ageEmployee;
	}
	public String getAdressEmployee() 
	{
		return AdressEmployee;
	}
	public void setAdressEmployee(String adressEmployee)
	{
		AdressEmployee = adressEmployee;
	}
	public double getSalaryEmployee() 
	{
		return SalaryEmployee;
	}
	public void setSalaryEmployee(double salaryEmployee) 
	{
		SalaryEmployee = salaryEmployee;
	}
	public String getDepartmentEmployee()
	{
		return DepartmentEmployee;
	}
	public void setDepartmentEmployee(String departmentEmployee) 
	{
		DepartmentEmployee = departmentEmployee;
	}
	
	public String toString()
	{
		return "IdEmployee:"+this.IdEmployee+
				"nameEmployee:"+this.NameEmployee+
				"AgeEmployee:"+this.AgeEmployee+
				"AddressEmployee:"+this.AdressEmployee+
				"SalaryEmployee:"+this.SalaryEmployee+
				"DepartmentEmployee:"+this.DepartmentEmployee;
	}
}
