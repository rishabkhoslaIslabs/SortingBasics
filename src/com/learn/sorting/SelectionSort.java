package com.learn.sorting;

public class SelectionSort {
	
	void Sort(int arr[],int n){
		for(int OuterLoop=0;OuterLoop<n-1;OuterLoop++){
			int Min=OuterLoop;
			for(int innerLoop=OuterLoop+1;innerLoop<n;innerLoop++)
				if(arr[innerLoop]<arr[Min]){
					Min=innerLoop;
				}
					int temp;
					temp=arr[OuterLoop];
					arr[OuterLoop]=arr[Min];
					arr[Min]=temp;	
					
				}
				
			}	
		
		

	public static void main(String[] args) {

		SelectionSort rishi=new SelectionSort();
		int arr[]={5,2,77,6,1,9,3,55,7};
		int n=9;
		System.out.println("array before sort is:");
		for(int i:arr){
			System.out.print(i);
		}
		rishi.Sort(arr, n);
		System.out.println("/n"+"array  after selection sort:");
		for(int j:arr)
			System.out.print(j);
		

	}

}
