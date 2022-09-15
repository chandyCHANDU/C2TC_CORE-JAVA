package assignments;

public class product {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,-4,-3,-2,-1};
		int sum=1;
		for(int i=0;i<9;i++) {
		
			if(arr[i]<0)
			{
				sum=sum+arr[i];
			}
		

	}
		System.out.println("the product of negative number is"+sum);
	}
}