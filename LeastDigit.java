package simple;
import java.util.Scanner;
import java.util.Arrays;
public class LeastDigit {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		int rem=0,i=0;
		String str=Integer.toString(a);
		int [] c=new int[str.length()];
		while(a!=0){
			rem=a%10;
			c[i]=rem;
			i++;
			a=a/10;
		}
		Arrays.sort(c);
		for(i=0;i<c.length-b;i++){
			System.out.println(c[i]);
		}
			s.close();
		}
	}

