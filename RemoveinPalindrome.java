package guvi;
import java.util.Scanner;
public class RemoveinPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i=new Scanner(System.in);
		int j=0;
		System.out.println("Given String is");
		String str=i.next();
		
			String a=str.substring(j,str.length()/2);
			String b=str.substring(str.length()/2,str.length());
			
			System.out.println("First Half is "+a);
			System.out.println("Second half is "+b);
			
			if(a.length()==b.length()){
				StringBuffer d=new StringBuffer(str);
				d.delete(str.length()/2,str.length()/2+1);
				System.out.println("After Removing "+d);
			}
		i.close();
	}

}
