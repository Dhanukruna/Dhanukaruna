package guvi;
import java.util.Scanner;
public class Subset {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int n=d.nextInt();
		int s=d.nextInt();
		int count=0;
		int[] a1=new int[n];
		int[] a2=new int[s];
		for(int i=0;i<n;i++){
			a1[i]=d.nextInt();
		}
		for(int j=0;j<s;j++){
			a2[j]=d.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a1[i]==a2[j]){
					count++;
				}
			}
		}
			if(count==a1.length){
				System.out.println("a1 is subset of a2");
			}
			else{
				System.out.println("a1 is not subset of a2");
			}
		d.close();

	}
	
}
