import java.util.Arrays;
import java.util.List;

public class Employeee2 {
	public static void main(String[] args) {
	
	Employeee1 e1=new Employeee1(1, "sameer", "pune");
	Employeee1 e2=new Employeee1(2, "pradnya","mumbai");
	Employeee1 e3=new Employeee1(3, "priya", "latur");
	Employeee1 e4=new Employeee1(4, "riya", "buldana");
	Employeee1 e5=new Employeee1(5, "supriya", "buldana");
	Employeee1 e6=new Employeee1(6, "riya1", "pune");
	Employeee1 e7=new Employeee1(7, "riya2", "buldana");
	Employeee1 e8=new Employeee1(8, "riya3", "pune");

	List<Employeee1>l=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
  List<Employeee1>ls=l.stream().filter(a->a.getAddress().equals("pune")).map(e->{
	  e.setId(e.getId()*2);
	  return e;
  }).sorted((o1,o2)->o1.getId()-o2.getId()).toList();
  System.out.println(ls);

}
}
class Employeee1{
	private int id;
private String name;
private String Address ;
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
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Employeee1(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	Address = address;
}
@Override
public String toString() {
	return "Employeee1 [id=" + id + ", name=" + name + ", Address=" + Address + "]";
}
}





