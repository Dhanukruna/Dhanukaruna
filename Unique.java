package guvi;
import java.util.Scanner;
public class Unique {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("The size of the array");
			int size=sc.nextInt();
			int[] a=new int[size];
			int count=0;
			System.out.println("The elements are");
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<size;i++){
				count=0;
				for(int j=i+1;j<size;j++){
					if(a[i]!=a[j]){
						count++;
					}
					
				}
				if(count==size-1){
					System.out.println(a[i]);
				}
				
			}
			
			sc.close();
		}

	}


