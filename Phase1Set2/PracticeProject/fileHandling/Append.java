package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Append {
   public static void main( String[] args ) {

      try {
         String data = " The Java codes are first compiled into byte code (machine-independent code). Then the byte code runs on Java Virtual Machine (JVM) regardless of the underlying architecture.";
         File f1 = new File("File.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("The content has been successfully appended");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}
