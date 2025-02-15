package Bai1_4;

import java.util.Scanner;

public class Employee {
private int id;
private String firstName, lastName;
private int salary;

public Employee() {

}

public Employee(int id, String firstName, String lastName, int salary) {
	
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return firstName+" "+lastName;
}
public int getAnnualSalary() {
	return salary*12;
}
public int raiseSalary(int percent) {
	double phantram=(double)percent/100;
	int raise=(int)(salary+salary*phantram);
	this.salary=(int)(salary+salary*phantram);
   return raise;
	
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 Employee e1 = new Employee(8, "Peter", "Tan", 2500);
     System.out.println(e1); 
     e1.setSalary(999);
     System.out.println(e1);  
     System.out.println("id is: " + e1.getId());
     System.out.println("firstname is: " + e1.getFirstName());
     System.out.println("lastname is: " + e1.getLastName());
     System.out.println("salary is: " + e1.getSalary());

     System.out.println("name is: " + e1.getName());
     System.out.println("annual salary is: " + e1.getAnnualSalary()); 
     System.out.println(e1.raiseSalary(10));
     System.out.println(e1);}

}
