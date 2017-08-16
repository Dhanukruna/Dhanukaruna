package simple;
import java.util.Scanner;
public class UserId {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n1=s.next();
		String n2=s.next();
		String reg=s.next();
		int c=s.nextInt();
		char l1=n1.charAt(0);
		char l2=n2.charAt(0);
		int a,b;
		String j=" ";
		for(int i=reg.length()-1;i>=0;i--){
			j+=reg.charAt(i);
		}
		if(n1.length()>n2.length()){
						System.out.println(n1.charAt(0)+n2+reg.charAt(c-1)+j.charAt(c));			
		}
		else if(n1.length()<n2.length()){
			System.out.println(n2.charAt(0)+n1+reg.charAt(c-1)+j.charAt(c));
		}
		else if(n1.length()==n2.length()){
		a=(int)l1;
		b=(int)l2;
			if(a>b){
				System.out.println(n1.charAt(0)+n2+reg.charAt(c-1)+j.charAt(c));
			}
			else{
				System.out.println(n2.charAt(0)+n1+reg.charAt(c-1)+j.charAt(c));
			}
		}
		s.close();
	}

}
