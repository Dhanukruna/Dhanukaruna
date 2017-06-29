package guvi;
import java.util.Scanner;
public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[4];
		System.out.println("The Number are");
		for(int i=0;i<4;i++){
			a[i]=s.nextInt();
		}
		System.out.println("The Target number is");
		int target=s.nextInt();
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				int b=a[i]+a[j];
				if(b==target){
					System.out.println(a[i]);
							
				}
			}
		}
s.close();
	}

}
