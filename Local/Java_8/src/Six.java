
public class Six {
	public static void main(String[] args) {
		GetService getService=price->price+18;
		System.out.println(getService.calculateGst(23));
	}

}
interface GetService{
	int calculateGst(int price);
}
