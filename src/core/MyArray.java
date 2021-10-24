package core;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,5,6};
		int arrSize = arr.length;
		find2ndHighest(arr,arrSize);
	}
	
	public static void find2ndHighest(int arr[], int arrSize ) {
		int largest,second,i;
		
		if(arrSize < 2) {
			System.out.println("There no second value"); 
			return;
		}
		
		largest = second = Integer.MIN_VALUE;
		
		for(i=0;i<arrSize;i++) {
			if(arr[i] > largest) {
				second = largest;
				largest = arr[i];
				
			}else if(arr[i] > second && arr[i] !=largest ) {
				second = arr[i] ;
			}
		}
		
		
		if(second == Integer.MIN_VALUE ) {
			System.out.println("There is no second largest value");
		}
		else {
			System.out.println("2nd Larget Value = "+second);
		}
	}
}
