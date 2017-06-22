package guvi;
import java.util.Scanner;
public class revere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int temp=0;
		for(int a=s1.length()-1;a>=temp;a--){
			System.out.print(s1.charAt(a));
		}
		
		sc.close();
	}
}
