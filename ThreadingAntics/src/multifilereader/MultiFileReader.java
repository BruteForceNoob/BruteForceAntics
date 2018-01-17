package multifilereader;

import java.io.IOException;

public class MultiFileReader {
	
    public static void main(String[] args){
        try {
            Reader r4 = new Reader("file4.txt");
            Reader r3 = new Reader("file3.txt"); 
            Reader r2 = new Reader("file2.txt"); 
            Reader r1 = new Reader("file1.txt");
            
         
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            
        }
        System.out.println("Done in main!");
    }   


}
