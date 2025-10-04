import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * List<String>al=new ArrayList<>();
		 *  al.add("pune");
		 *   al.add("mumbai");
		 * al.add("delhi"); 
		 * Student8 s1=new Student8("john", al);
		 *  List<String>al2=new ArrayList<>(); 
		 *  al2.add("kalkatta");
		 *   al2.add("pune"); 
		 *   al2.add("delhi");
		 * Student8 s2=new Student8("bob", al);
		 * System.out.println(s1);
		 * System.out.println(s2);
		 */
List<Student8>l=Arrays.asList(new Student8("john", Arrays.asList("pune","mumbai","delhi")),new Student8("bob", Arrays.asList("kolkatta","delhi")));
	List<List<String>>ll=	l.stream().map(a->a.getAddress()).toList();
		System.out.println(ll);
	}
}
class Student8{
	private String name;
	private List<String> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	public Student8(String name, List<String> address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}
