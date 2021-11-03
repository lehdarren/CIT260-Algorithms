//This program is going to read from a file using a while loop and has next
import java.util.Scanner;
import java.io.*;
public class FileRead {
	public static void main(String[] args) throws IOException
	{
		//declares file
		File file = new File("file.txt");
		
		//declares scanner
		Scanner importFile = new Scanner(file);
		
		//while loop that iterates as long as a new line exists
		while (importFile.hasNext())
		{
			String contents = importFile.nextLine();
			System.out.println(contents);
		}
		importFile.close();
		/*launch process builder to open the document.Opens a specific application with a specific file line
		 *process builder is a command line class that runs the line through command prompt and uses the file in the argument.
		 *basically using the command prompt to open a specific file with a specific application
		 */
		ProcessBuilder run = new ProcessBuilder("Notepad.exe", "C:\\Users\\Darren J. Leh\\eclipse-workspace\\FileRead\\file.txt");
		run.start();
		
	}
}
