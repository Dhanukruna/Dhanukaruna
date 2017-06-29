package guvi;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("The String is");
		String s1=a.next();
		String s2="";
		for(int i=0;i<s1.length();i++){
			if(s2.contains(s1.charAt(i)+"")){
				
			}
			else{                        
				s2+=s1.charAt(i);
			}
			}
			
			System.out.println(s2);
			a.close();
		}
	
	}
