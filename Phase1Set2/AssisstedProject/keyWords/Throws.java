package keyWords;

import java.io.*;
import java.util.*;
  
public class Throws {
  
    public static void writeToFile() throws Exception
    {
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("myFile.txt"));
        bw.write("Test");
        bw.close();
    }
  
    public static void main(String[] args) throws Exception
    {
        try {
            writeToFile();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}