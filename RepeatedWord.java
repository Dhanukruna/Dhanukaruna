package guvi;
import java.util.Scanner;
public class RepeatedWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count,max=0;
		String ans=" ";
		String[] a=str.split(" ");
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length;j++){
				count=0;
				for(int k=0;k<a[i].length();k++){
					if(a[i].charAt(j)==a[i].charAt(k)){
						count++;
					}
				}
					if(count>max){
						ans=a[i];
						max=count;
					}
				}
			}
			System.out.println(ans);
		s.close();
	}

}
