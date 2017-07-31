package guvi;
import java.util.Scanner;
public class OddWordReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String c=" ",d=" ";
		String[] a=str.split(" ");
		for(int i=0;i<a.length;i++){
		if(i%2==0){
			StringBuffer b=new StringBuffer(a[i]);
			d=b.reverse()+" ";
		}
		else{
		   d=a[i];
		}
		c=c+d+" ";
		}
		System.out.println(c);
		s.close();
	}
}
