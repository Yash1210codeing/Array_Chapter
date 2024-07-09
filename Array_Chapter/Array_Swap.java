package Array_Chapter;
public class Array_Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {1,2,3,4,5};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0]+" "+arr[1]);
	}
	public static void swap(int a,int b) {
		int tem=a;
		a=b;
		b=tem;		
	}	
}
