import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Java8_Comparator {
	public static void main(String[] args) {
		Employee e1=new Employee(45, "john");
		Employee e2=new Employee(20, "sam");
		Employee e3=new Employee(67, "Ram");
	 Comparator<Employee> nc=( o1,  o2)->  o1.getId()-o2.getId();
	    
			
		Set<Employee> s=new TreeSet<>(( o1,  o2)->  o1.getId()-o2.getId());
		s.add(e1);
		s.add(e2);
		s.add(e3);
		System.out.println(s);
	}
}
	class Employee{
		private int  id;
		private String name;
		public Employee(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public void setId(int id) {
			this.id=id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		
	}


