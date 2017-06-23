package guvi;
import java.util.Scanner;
public class FirstRepeated {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++){
			count=0;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					System.out.println("The First Repeated Element in the Array is"+a[i]);
				}
				
				
			}
		}
		
		input.close();
	}

}
