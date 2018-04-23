package com.learn.sorting;

public class QuickSort {
	int partition(int arr[],int low,int high){
		int pivot=arr[high];
		int i=(low-1);
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
					
			}	
			
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		
		return i+1;
		
		
	}
	void sort(int arr[],int low,int high){
		if(low<high){
			int pi=partition(arr, low, high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
			
		}
	}
	

	public static void main(String[] args) {
		
		QuickSort rishi=new QuickSort();
		int arr[]={3,6,2,4,1,7,5,9,8};
		int n=arr.length;
		System.out.println("array before sort:");
		for(int i:arr)
			System.out.print(i);
		System.out.println();
		rishi.sort(arr, 0, n-1);
	
		System.out.print("array after quicksort is:");
		for(int i:arr)
		System.out.print(i);
		
		
		
	}

}
