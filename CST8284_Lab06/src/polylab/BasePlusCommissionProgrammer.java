package polylab;
/*
 * class name: CST8284
 * Student: Jie Ke
 * Due date: July 25
 * Class name:BasePlusCommissionProgrammer
 * 
 */
//Lab 6 - BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
	private double baseSalary; // base salary per week

	//constructor
	public BasePlusCommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, 
				month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	}

	//set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	} 

	//return base salary
	public double getBaseSalary() {
		return baseSalary;
	}

	//calculate earnings; override method earnings in CommissionProgrammer
	@Override                                                            
	public double earnings() {                                             
		return getBaseSalary() + super.earnings();                        
	} 

	//return String representation of BasePlusCommissionProgrammer object
	@Override     
	public String toString() {

		return String.format("base-salaried %s; base salary: $%,.2f", super.toString() 
			, getBaseSalary());

	}
}



