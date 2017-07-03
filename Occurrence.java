package guvi;
import java.util.Scanner;
public class Occurrence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		String[] str=new String[i];
		for(int j=0;j<i;j++){
			str[j]=s.next();
			if(str[j].length()==1){
				System.out.println(str[j]);
			}
		}
		s.close();
	}

}
