import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

class file2{
  
    public static void main(String args[]){
      try{
         FileInputStream fn = new FileInputStream("xyz.txt");
         int i=0;
         while(i!=-1){
            i = fn.read();
            System.out.println((char)i);
        }
        System.out.println(" ");
        fn.close();
      }
      catch(Exception e){
         System.out.println(e);
      }
      try{
         FileOutputStream fout = new FileOutputStream("xyz.txt");
         System.out.println("Enter the new content of the file");
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         byte[] b = s.getBytes();
         fout.write(b);
         System.out.println("file cannot be updated");
         fout.close();
         }
         catch(Exception e){
            System.out.println(e);
         }
    }
}

