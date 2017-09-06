package guvi;
import java.util.Scanner;
public class RemoveVowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char a=0;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')){
			a=str.charAt(i);	
			System.out.print(a);
			}
		}
		s.close();
	}

}
