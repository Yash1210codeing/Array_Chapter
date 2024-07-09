package Array_Chapter;
import java.util.*;
public class users_Input_Array_with_Function {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int [size];
        for(int i=0;i<size;i++) {
        	arr[i]=sc.nextInt();        	
        }
        display(arr);              	
        }
	 public static void display(int[]arr) {
		 for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" "); 
		 }      
	}
 }
