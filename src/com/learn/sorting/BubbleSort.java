package com.learn.sorting;

public class BubbleSort {
	
	void sort(int arr[],int n){
		for(int outerloop=0;outerloop<n-1;outerloop++){
			for(int innerloop=outerloop+1;innerloop<n;innerloop++){
				if(arr[innerloop]<arr[outerloop]){
					int temp=arr[innerloop];
					arr[innerloop]=arr[outerloop];
					arr[outerloop]=temp;
					
				}
				
			}
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		BubbleSort rishi=new BubbleSort();
		
		int arr[]={2,3,1,5,4,8,69,7};
		int n=arr.length;
		rishi.sort(arr,n);
		System.out.println("array after bubble sort is");
		for(int x:arr)
			System.out.println(x);
		
		

	}

}
