package guvi;
import java.util.Scanner;
public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object=new Scanner(System.in);
		int a=object.nextInt();
		int b=0,rem,rev=0;
		while(a!=0){
			rem=a%10;
			b+=rem;
			a/=10 ;                      
		}
		System.out.println(b);
		int c=b;
		int r;
		while(b!=0){
			r=b%10;
			rev=rev*10+r;
			b/=10;
		}
		System.out.println(rev);
	if(c==rev){
		System.out.println("The Given number is Palindrome");
	}
	else{
		System.out.println("The Given number is not palindrome");
	}
object.close();
	}

}
