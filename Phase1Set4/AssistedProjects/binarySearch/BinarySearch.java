package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int array[]= {2,3,5,1,7,9,19,32,88,23};//unsorted
		Scanner s=new Scanner(System.in);
		System.out.println("enter the key element");
		int element=s.nextInt();
		//sorted the array
		Arrays.sort(array);
		int low=0;
		int high=array.length-1;
		int mid=0;
		int flag=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(array[mid]==element) {
				flag=1;
				break;
			}
			else if(array[mid]<element) {
				low=mid+1;
			}
			else {
			high=mid-1;
			}
		}
		if(flag==1) {
			System.out.println("Element is found at the location "+mid );
		}
		else {
			System.out.println("Element is  not found");
		}
	}

}
