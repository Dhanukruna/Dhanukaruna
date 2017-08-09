package guvi;
import java.util.Scanner;
public class Pro {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		String a=" ";
		String b=" ";
		int n=0;
		for(int i=0;i<s1.length();i++){
			 n=(int)s1.charAt(i)+10;
			a+=(char)n;
		}
		b+=s2.charAt(0);
		n=(int)s2.charAt(1)+10;
		b+=(char)n;
		n=(int)s2.charAt(2)-16;
		b+=(char)n;
		b+=s2.charAt(s2.length()-1);
		System.out.println(a+" "+b);
	s.close();
	}
}
