package guvi;
import java.util.Scanner;
public class Reverse {
public  static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String[] b=a.split(" ");
	for(int i=b.length-1;i>=0;i--){
		System.out.print(b[i]+" ");
	}
	s.close();
}
}
