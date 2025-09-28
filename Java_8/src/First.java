

public class First {
public static void main(String[] args) {
	
	
	VotingService vs=  age-> age>18;
			
	
	
	
			
	
	System.out.println(vs.isEligible(15));
	}
}

interface  VotingService{
	boolean isEligible(int age);
}

	
