//Given a list of employees (id, name, salary), filter employees with salary > 50,000 and sort them by salary.

import java.util.Arrays;
import java.util.List;

public class Seventh {
public static void main(String[] args) {
	Employee1 e1=new Employee1(12,"prerna",60000);
	Employee1 e2=new Employee1(2,"pratiksha",45000);
	Employee1 e3=new Employee1(3,"yogita",300000);
	Employee1 e4=new Employee1(4,"nikhil",50980);
	List<Employee1>l=Arrays.asList(e1,e2,e3,e4);
	List<Employee1> ls=  l.stream().filter(e->e.getSalary()>50000).sorted((o1,o2)->o1.getSalary()-o2.getSalary()).toList();
	System.out.println(ls);
}
}
class Employee1{
private int id;
private String name;
private int salary;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public Employee1(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}




}

