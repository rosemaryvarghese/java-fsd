package fileHandling;

import java.io.FileWriter;   


import java.io.IOException;   

class Write {  
 public static void main(String[] args) {  
   
 try {  
     FileWriter fwrite = new FileWriter("File.txt");  
    
     fwrite.write("Java has been one of the most popular programming languages for many years.\r\n"
     		+ "Java is Object Oriented. However, it is not considered as pure object-oriented as it provides support for primitive data types (like int, char, etc)");   

      
     fwrite.close();   
     System.out.println("Content has been successfully written.");  
 } catch (IOException e) {  
     System.out.println("Unexpected error occurred");  
     e.printStackTrace();  
     }  
 }  
}  
