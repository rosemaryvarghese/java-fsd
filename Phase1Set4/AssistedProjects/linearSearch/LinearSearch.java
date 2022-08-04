package linearSearch;

import java.util.Scanner;  

class LinearSearch   
{  
  public static void main(String args[])  
  {  
    int i, n, search, arr[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    arr = new int[n];  
   
    System.out.println("Enter the " + n + " numbers");  
   
    for (i = 0; i < n; i++)  
      arr[i] = in.nextInt();  
   
    System.out.println("Enter value to search in the array");  
    search = in.nextInt();  
   
    for (i = 0; i < n; i++)  
    {  
      if (arr[i] == search)     /* Searching element is present */  
      {  
         System.out.println(search + " is present at location " + (i + 1) + ".");  
          break;  
      }  
   }  
   if (i == n)  /* Element to search isn't present */  
      System.out.println(search + " isn't present in array.");  
  }  
}  
