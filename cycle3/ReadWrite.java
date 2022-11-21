import java.io.*;
import java.util.*;
public class ReadWrite {

    public static void main(String[] args) throws FileNotFoundException, IOException {

	try {
        	Writer r = new FileWriter("abc.txt");
		String S = "AnJoMa";
		r.write(S);
		r.close();
		System.out.println("File Written");
	}
	catch(Exception e ){
		System.out.println (e);
	}
	
	try {        
		Reader r = new FileReader("abc.txt");
        	int ch;
		ch = r.read();
        	while ( ch != -1){
        		System.out.print((char) ch);	
			ch = r.read();
		}
        	r.close();
		System.out.println("");
	}
	catch(Exception e ){
		System.out.println (e);
	}

    }
}
