package com.learn.sorting;

public class InsertionSort {
    void sort(int arr[],int n){
    	for(int j=1;j<n;j++){
    		 int key = arr[j];
    		 int i=j-1;
    	while(i>=0&&arr[i]>key){
    		arr[i+1]=arr[i];
    		i--;
    	}
    	
    		arr[i+1]=key;
    	
    	}		
    }
	
	public static void main(String[] args) {
		InsertionSort rishi=new InsertionSort();
		int arr[]={3,5,1,4,7,2,9,6};
		int n=arr.length;
		System.out.println("the array after insertion sort:");
		rishi.sort(arr, n);
		for(int i:arr)
			System.out.println(i);
		
		

	}

}
