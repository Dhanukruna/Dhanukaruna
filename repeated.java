package guvi;
import java.util.Scanner;
public class repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("The size of the array");
		int size=sc.nextInt();
		int count=0;
		int[] a=new int[size];
		System.out.println("The elements are");
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			
		}
		System.out.println("The Repeated values are"+count);
		
		sc.close();
	}

}
