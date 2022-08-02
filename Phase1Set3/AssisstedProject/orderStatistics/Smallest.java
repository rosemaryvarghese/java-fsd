package orderStatistics;


import java.util.Arrays;
import java.util.Collections;

class Smallest {

	public static int kthSmallest(Integer[] array,
								int k)
	{
		
		Arrays.sort(array);

	
		return array[k - 1];
	}

	
	public static void main(String[] args)
	{
		Integer array[] = new Integer[] { 12, 3, 5, 7, 20  };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(array, k));
	}
}


