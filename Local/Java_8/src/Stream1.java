import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> s=new ArrayList<Integer>();
		s.add(10);
		s.add(80);
		s.add(15);
		s.add(10);
		s.add(10);
		s.add(55);
		//////Predicate<Integer> myPredicate=(Integer age)->age>18;
				
		
	//	List l=s.stream().filter((Integer age)->age>18).toList();
		//long l=s.stream().filter((Integer age)->age>18).count();
		//List  l=s.stream().filter((Integer age)->age>18).distinct().toList();
		long  l=s.stream().filter((Integer age)->age>18).distinct().count();
		
		////Stream<Integer>stream=s.stream();
		////Stream fs=  stream.filter(myPredicate);
		////List l=fs.toList();
		System.out.println(l);
		
		//List l2=new ArrayList<>();
//		for(Integer age:s)
//		{
//			if(age>18)
//			{
//				s.remove(age); //Concurrent Modification Exception 
//				l2.add(age);
//			}
//		}
//		System.out.println(l2);
//	}
		
	}
};
class MyPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		if(t>18)
			return true;
		return false;
	}
	
	
}
