package Array_Chapter;
public class Array_Other_Array_Change_Reflect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// Output Print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int[] other = arr;
		other[2] = 9;
		other[1] = 7;  
		System.out.println(other[2]);
		System.out.println(other[1]);
		System.out.println(other);
	}
}
