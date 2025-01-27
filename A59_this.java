package assignpackage;

public class A59_this {
	int age;
	String name;
	double salary;
	void employee_details(int age,String name,double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		
	}
	public static void main(String[] args)
	
	{
		A59_this a1=new A59_this();
		a1.employee_details(18, "sonali", 50000);
		System.out.println(a1.age);
		System.out.println(a1.name);
		System.out.println(a1.salary);
		
		
	}

}
