package Methods;

public class m1 {
	
		public static void main(String[] args) {
		 
		
					Employee e1=new Employee(1,"john");
					Employee e2=new Employee(2,"john");
					System.out.println(e1.toString());
				}
				class Employee {
				 
				 public int geteID() {
					return eID;
				 }
				 public void seteID(int eID) {
					this.eID = eID;
				 }
				 public String geteName() {
					return eName;
				 }
				 public void seteName(String eName) {
					this.eName = eName;
				 }
				 public Employee(int id,String name) {
					 super();
					 this.eName=name;
					 this.eID=eID;
				 }

				}
				
              e1=new Employee("john",1);
			Employee e2=new Employee("john",2);
			System.out.println(e1.toString());
		}
		class Employee {
			private int eID;
			private String  eName;
		 public String toString() {
			 return "name"+eName+"eID:"+eID;
			 
		 }
		 public int geteID() {
			return eID;
		 }
		 public void seteID(int eID) {
			this.eID = eID;
		 }
		 public String geteName() {
			return eName;
		 }
		 public void seteName(String eName) {
			this.eName = eName;
		 }
		

		}
		}
	