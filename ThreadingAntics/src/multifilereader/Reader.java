package multifilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader implements Runnable {

	File file;
	Thread thread;
	BufferedReader br=null;
	
	public Reader(String filePath) throws FileNotFoundException {
		this.file = new File(filePath);
		
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				throw new FileNotFoundException("File "+filePath+" not found!");
			}
		
		
		thread=new Thread(this);
		thread.start();
	}

	@Override
	public void run()  {
		
		try
		{ 
			int wordCount=0;
			 
			 System.out.println("Processing file: " + file.getName());
			 String line=br.readLine();
			while(line!=null)
			 {
				wordCount+= line.split(" ").length;
				 line=br.readLine();
			 }
			 
			 System.out.println(file.getName()+": "+ wordCount);
			
			
		}
		catch(FileNotFoundException e)
		{
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		
	}

}
