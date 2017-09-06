package guvi;
import java.util.Scanner;
public class Weekdays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b="Sunday";
		if(a.equals(b)){
			System.out.println("False");
		}
		else{
			System.out.println("True");
		}
		s.close();
	}

}
