
public class Second {
	
public static void main(String[] args) {
	JobStatusServive js= percentage-> {
		if(percentage>98) {
			System.out.println("you will get a job");
		}
		
		else {
			System.out.println("try again and again");
		}
		
	
};
js.jobStatus(76);

}
interface JobStatusServive{
	public void jobStatus(int percentage);
}
}