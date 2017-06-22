package guvi;
import java.util.Scanner;
public class intreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem=0;
		while(a!=0){
			rem=a%10;
			a=a/10;
			System.out.print(rem);
		}
		
sc.close();
	}

}
