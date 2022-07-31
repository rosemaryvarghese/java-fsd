package fileHandling;

import java.io.File;  

import java.io.IOException;   
class CreateFile {  
            public static void main(String args[]) {  
            try {  
                    // Creating an object of a file  
                    File f0 = new File("File.txt");   
                    if (f0.createNewFile()) {  
                               System.out.println("File " + f0.getName() + " is created successfully.");  
                    } else {  
                               System.out.println("File already exists in the directory.");  
                    }  
                  } catch (IOException exception) {  
                           System.out.println("An unexpected error occurred.");  
                           exception.printStackTrace();  
               }   
     }  
} 
