package guvi;
	import java.util.Scanner;
	public class Difference {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Input Weights:");
			int a=s.nextInt();
			int rem=a/2;
			int diff=a-rem;
			int b=diff-rem;
			System.out.print(diff);
			System.out.println(" "+rem);
			if(rem==diff){
				System.out.println("Output"+b);
			}
			else{
				System.out.println("Output"+b);
			}
			s.close();

}
	}
