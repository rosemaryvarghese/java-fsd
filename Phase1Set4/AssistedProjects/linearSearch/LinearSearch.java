package linearSearch;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {2,3,5,1,7,9,19,32,88,23};//unsorted
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key element");
		int ele=sc.nextInt();
		int flag=0;
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==ele) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		if(flag==1) {
			System.out.println("element found at index "+ i);
		}
		else {
			System.out.println("element is not found");
		}
		
	}

}
