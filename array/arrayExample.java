package array;

public class arrayExample{  
public static void main(String args[]){  
	System.out.println("---------One dimensional Array-------");  
int array[]=new int[3];  
array[0]=1;
array[1]=2;  
array[2]=3;  
for(int i=0;i<array.length;i++)
System.out.println(array[i]);  
System.out.println("---------Multi dimensional Array-------");  
int arr[][]={{1,2,3},{3,4,5},{6,7,8}};  
//printing 2D array  
for(int i=0;i<3;i++){  
for(int j=0;j<3;j++){  
 System.out.print(arr[i][j]+" ");  
}  
System.out.println();  
}}} 