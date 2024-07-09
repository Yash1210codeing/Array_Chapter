package Array_Chapter; 
import java.util.*;
public class Array_Users_Input {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++) {
        	arr[i]=sc.nextInt();
        	System.out.print(arr[i]+" ");
        }
	}
}
