import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class map {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("yogita","prerna","pratiksha","akansha");
		List<String>nl=new ArrayList<>();
		/*1)
		 * for(String name:list) 
		 * { 
		 * String n=name.toUpperCase();
		 *  nl.add(n); 
		 *  }
		 * System.out.println(nl); 
		 * }
		 * 
		 * }
		 */

		/*2)
		 * Function<String, String>f=new MyFunction(); List<String>ll=
		 * list.stream().map(f).toList(); System.out.println(ll); } } class MyFunction
		 * implements Function<String, String>{
		 * 
		 * @Override public String apply(String t) { // TODO Auto-generated method stub
		 * return t.toUpperCase();
		 */
		List< String> ll= list.stream().map(t->t.toUpperCase()).toList();
		System.out.println(ll);
	}
}
