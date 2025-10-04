import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sleep_Limit_30_9 {
	public static void main(String[] args) {
		Employeee e1=new Employeee(10,"yogita","mumbai",45000);
		Employeee e2=new Employeee(34,"nikita","pune",90000);
		Employeee e3=new Employeee(34,"nikita","pune",   90000);
		Employeee e4=new Employeee(5,"prachi", "banglore",  700000);
		Employeee e5=new Employeee(6,"pratiksha","up",80000);
		List<Employeee>l=Arrays.asList(e1,e2,e3,e4,e5);
		//get employees only  from pune ,pune employees salary is greater than 50000 and remove dublicate imployees
		
		//List<Employeee> ls=  l.stream().filter(e->  e.getAddress().equals("pune")).filter(e->e.getSalary()>50000).distinct().toList();
		//System.out.println(ls);
		/*2)
		 * for(Employeee e:l) { if(e.getAddress().equals("pune")) {
		 * 
		 * 
		 * e.setSalary(e.getSalary()*2);
		 * 
		 * }
		 * 
		 * } System.out.println(l);
		 */
		/*3)
		 * Function<Employeee, Employeee>f=t->{ if(t.getAddress().equals("pune"))
		 * 
		 * t.setSalary(t.getSalary()*2); return t;
		 * };
		 */

		/*
		 * Function<Employeee, Employeee>n=e->{ if(e.getAddress().equals("pune"))
		 * e.setSalary(e.getSalary()*2);
		 
				  
				   return e;
			};*/
		List<Employeee> nl =l.stream().filter(e->e.getAddress().equals("pune")).map(e->{
			  if(e.getAddress().equals("pune"))
				  e.setSalary(e.getSalary()*2);
			 
			  
			   return e;
		}).filter(e->e.getAddress().equals("mumbai")).filter(e->e.getSalary()>10000).toList();
		
	System.out.println(nl);
	}
}

/*
 * class Myfunction implements Function<Employeee, Employeee>{
 * 
 * @Override public Employeee apply(Employeee t) {
 * if(t.getAddress().equals("pune")) { t.setSalary(t.getSalary()*2); }
 * 
 * return t;
 * 
 * 
 * } }
 */

class Employeee {
	private int id;
	private String name;
	private String address;
	private int salary;

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name)
				&& salary == other.salary;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employeee(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
