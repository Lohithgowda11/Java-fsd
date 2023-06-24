package phase_1_project_assessment2;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
	public static void main(String[] args)throws IOException {
		
		 
        // Creating an object of a file  
	     Path path = Paths.get("C:\\Users\\LOHITH GOWDA C V\\Desktop\\test2.txt");  
		 try { 
		 Files.createFile(path);
           
       } catch (FileAlreadyExistsException ex) {
           
           System.err.println("File already exists");
       }
		 
		 //for reading
		 Path mypath = Paths.get("C:\\Users\\LOHITH GOWDA C V\\Desktop\\test2.txt"); 
		 List<String> lines = Files.readAllLines(mypath, StandardCharsets.UTF_8);
	        
	        lines.forEach(line -> System.out.println(line));
	     
	     //for writing
	     Path myPath = Paths.get("C:\\Users\\LOHITH GOWDA C V\\Desktop\\test2.txt"); 
	     List<String> line = new ArrayList<>();
	     line.add("mango");
	     line.add("apple");
	     line.add("banana");
	     line.add("watermelon");
	     line.add("orange");
	     
	     Files.write(myPath, line, StandardCharsets.UTF_8, 
	    	        StandardOpenOption.CREATE);

	    	System.out.println("Data written to a file");
	    	
	    	//for deleting entire content in file
	    	boolean fileDeleted = Files.deleteIfExists(myPath);
	        
	        if (fileDeleted) {
	            
	            System.out.println("File deleted");
	        } else {
	            
	            System.out.println("File does not exist");
	        }

}
}
