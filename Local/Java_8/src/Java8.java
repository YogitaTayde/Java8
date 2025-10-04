import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Java8 {
	public static void main(String[] args) {
		Student2 s1=new Student2("sanika", "pune",5);
		Student2 s2=new Student2("yogita", "mumbai",20);
		Student2 s3=new Student2("sanika", "pune",5);
		Student2 s4=new Student2("priya", "punjab",4);
		Student2 s5=new Student2("puja", "haryana",34);
		Student2 s6=new Student2("pratiksha", "latur",45);
		List<Student2> l=Arrays.asList(s1,s2,s3,s4,s5,s6);
////List<Student2>s=	l.stream().filter(Student2->Student2.getAddress().equals("pune") ) .sorted((o1,o2)->o1.getRollNo()-o2.getRollNo()).toList();
	////	System.out.println(s);
List<Student2> s=l.stream().filter(st->st.getAddress().equals("pune")).distinct().toList();
	System.out.println(s);
	}
}
		
		//Comparator<Student2>c=new Mycomparator();
		//List<Student2> s=  l.stream().filter(Student2->Student2.getAddress()=="pune").sorted(c).toList();
		//System.out.println(s);
//	}
//	}
//class Mycomparator implements Comparator<Student2>{

	//@Override
	//public int compare(Student2 o1, Student2  o2) {
		// TODO Auto-generated method stub
		//return o1.getRollNo()-o2.getRollNo();
//	}
	
//}
	
	class Student2{
		private String name;
		
		private String address;
		private int rollNo;
		
		public Student2(String name, String address, int rollNo) {
			super();
			this.name = name;
			this.address = address;
			this.rollNo = rollNo;
		}

		@Override
		public int hashCode() {
			return Objects.hash(address, name, rollNo);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student2 other = (Student2) obj;
			return Objects.equals(address, other.address) && Objects.equals(name, other.name) && rollNo == other.rollNo;
		}

		
		@Override
		public String toString() {
			return "Student2 [name=" + name + ", address=" + address + ", rollNo=" + rollNo + "]";
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

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
	}

		
	
	


