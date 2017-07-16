package Java_Collection_Examples;

public class Minimum_value {
	static void min(int arr[]){  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println(min);  
		}  
		  
		public static void main(String args[]){  
		  
		int a[]={33,3,4,2,5,1};  
		min(a);//passing array to m
		}
}
