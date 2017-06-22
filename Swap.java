package guvi;
import java.util.Scanner;
public class Swap {

		public static void main(String[] args) {
		   Scanner name=new Scanner(System.in);
		   String s=name.next();
		   String even="";
		   String odd="";
		   int l=s.length();
		   for(int i=0;i<=l-2;i+=2){
			   even+=s.charAt(i+1)+""+s.charAt(i);
		   }
		   if(l%2!=0){
			   odd=even+s.charAt(l-1);
			   System.out.println(odd);
		   }
		   else{
			   System.out.println(even);
		   }
	name.close();	
}
}