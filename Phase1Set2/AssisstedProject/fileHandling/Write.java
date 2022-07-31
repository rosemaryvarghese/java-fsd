package fileHandling;

import java.io.FileWriter;   

//Importing the IOException class for handling errors  
import java.io.IOException;   

class Write {  
 public static void main(String[] args) {  
   
 try {  
     FileWriter fwrite = new FileWriter("File.txt");  
     // writing the content into the FileOperationExample.txt file  
     fwrite.write("Java has been one of the most popular programming languages for many years.\r\n"
     		+ "Java is Object Oriented. However, it is not considered as pure object-oriented as it provides support for primitive data types (like int, char, etc)");   

     // Closing the stream  
     fwrite.close();   
     System.out.println("Content is successfully wrote to the file.");  
 } catch (IOException e) {  
     System.out.println("Unexpected error occurred");  
     e.printStackTrace();  
     }  
 }  
}  