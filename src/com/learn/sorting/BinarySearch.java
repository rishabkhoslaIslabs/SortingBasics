package com.learn.sorting;

public class BinarySearch {
	
static	int  search(int arr[],int low,int high,int item){
		
	if(low<high){
	int mid=low+(high-low)/2;
	if(arr[mid]==item){
		return mid;
		
	}else if(item>arr[mid]){
	return search(arr,mid+1,high,item);}
	else if(item<arr[mid]){
		return search(arr,low,mid-1,item);
		
	}
	
	}
	return -(low+1);
	}
	

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8};
		int n=arr.length;
		int position=search(arr,0,n-1,4);
		System.out.println(position);
		
	}

}
