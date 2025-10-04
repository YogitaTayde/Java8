import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class normal{
	public static void main(String[] args) {
		Student s1=new Student("yogita ", "andhari");
		Student s2=new Student("prerna ", "bhokardan");
		Student s3=new Student("pratiksha ", "pune");
		Student s4=new Student("purva ", "buldana");
		Student s5=new Student("harshu", "beed");
		Student s6=new Student("vaishu ", "pune");
		Student s7=new Student("neha ", "andhari");
		List<Student>l=Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		Predicate p=new Mypredicate();
		List<Student> s=l.stream().filter(p).toList();
		System.out.println(s);
	}
}
class Mypredicate implements Predicate<Student>{

	@Override
	public boolean test(Student t) {
		if(t.getAddress()=="pune")
		
		return true;
		return false;
		
	}
	

}
	class Student{
		private String name;
		private String address;
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
		public Student(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", address=" + address + "]";
		}
		
	}


