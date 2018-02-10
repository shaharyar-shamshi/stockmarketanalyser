package stockmarket;
import java.io.*;
import java.util.StringTokenizer;

public class extractdata {
	
	File file = new File("/home/shaharyar/Desktop/stockmarketanalyser/stockmarket/src/stockmarketdata");
	 int row=0;
	 
	  String [][] item;
	  
	  public boolean FileExist() {
		  return file.isFile();
		  
	  }
	  
	  public int totalrow() {
		  row=0;
		  if(FileExist()) {
			  try {
				  BufferedReader reader = new BufferedReader(new FileReader(file));
				  while(reader.readLine() != null) {
					  row++;
				  }
			  } catch(Exception e) {
				  System.out.println(e);
			  }
		  }
		  else {
			  System.out.println("File do not exist");
		  }
		  return row;
	  }
	  

}
