package guvi;
import java.util.Scanner;
public class ReverseWord {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String a=s.nextLine();
			String s1="";
			String[] b=a.split(" ");
			for(int i=b.length-1;i>=0;i--){
				s1+=b[i]+" ";
				
			}
			System.out.println(s1);
	s.close();
		}

	}
                 