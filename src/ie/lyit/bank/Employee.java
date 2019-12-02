package ie.lyit.bank;

public class Employee extends Person{
	private Date startDate;
	public double salary;
	private int number;
	public double wage;
	private static int nextNumber;
	
	public Employee() {
		this.startDate=new Date();
		this.salary=0.0;
		this.number=0;
	}
	
	public Employee(Name n, Date dob, Date startDate, double salary) {
		name=n;
		dateOfBirth=dob;
		startDate=startDate;
		salary=salary;
	}
	
	@Override
	public String toString() {
		return name.toString()+", "+dateOfBirth+", "+startDate+", "+salary;
	}
	public boolean equals(Object obj) {
		Employee eObject;
		if(obj instanceof Employee)
			eObject=(Employee)obj;
		else
			return false;
		
		return(name.equals(eObject.name)&&
				dateOfBirth.equals(eObject.dateOfBirth)&&
				startDate.equals(eObject.startDate));
	}
	
	public void incrementSalary(double incrementAmount) throws Exception {
		double total=incrementAmount+salary;
		if(total>=150000) {
			throw new Exception("Employee over maximum salary");
		}
		else {
			System.out.println("Employee salary: "+salary);
		}
		
	}
	
	public double calculateWage(double taxPercentage) {
		wage=salary/12;
		taxPercentage=wage*(5/100);
		wage = wage-taxPercentage;
		
		return wage;
		
	}
	
	public void setName(Name nameIn){
		name = nameIn;
	}
	public Name getName(){
		return name;
	}
	public void setDateOfBirth(Date dateOfBirthIn){
		dateOfBirth = dateOfBirthIn;
	}
	public Date getDateOfBirth(){
		return dateOfBirth;
	}
	public void setStartDate(Date startDateIn) {
		startDate=startDateIn;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setSalary(double salaryIn) {
		salary=salaryIn;
	}
	public double getSalary() {
		return salary;
	}
}
