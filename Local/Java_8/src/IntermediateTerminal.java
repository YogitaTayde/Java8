import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IntermediateTerminal {
public static void main(String[] args) {
	
	Employees e1=new Employees(20,"yogita");
	Employees e2=new Employees(30, "pinkii");
	Employees e3=new Employees(40, "pratiksha");
	Employees e4=new Employees(46, "prerna");
	Employees e5=new Employees(47, "apeksha");
	Employees e6=new Employees(40, "akansha");
	List<Employees>l=Arrays.asList(e1,e2,e3,e4,e5,e6);
	List<Employees> l1= l.stream().filter(e->e.getId()>40).toList();
	System.out.println(l1);
}
}
class Employees{
	private int id;
	private String name;
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
	
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}
	
	
}