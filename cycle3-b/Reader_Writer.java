import java.io.File;

import java.util.*;
import java.util.Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

class cycl41{
   
    public static void main(String args[]){
    try{
        Reader r = new FileReader("pqr.txt");
        int ch;
        ch = r.read();
        while(ch!=-1)
        {
            System.out.println((char)ch);
            ch = r.read();
        }
        System.out.println(" ");
        r.close();
    }
    catch(Exception e){
      System.out.println("program executed" +e);
    }
    try{
      Writer w = new FileWriter("pqr.txt");
      String s = "This is changed file";
      w.write(s);
      w.close();
      System.out.println("file written");
   }
   catch(Exception e){
      System.out.println(" program executed");
   }
}

