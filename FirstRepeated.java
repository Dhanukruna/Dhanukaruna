package guvi;
import java.util.Scanner;
public class FirstRepeated {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++){
			count=0;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					count++;
				}
				if(count==1){
					System.out.println(a[i]);
				}
				
			}
			
		}
		
		input.close();
	}

}
