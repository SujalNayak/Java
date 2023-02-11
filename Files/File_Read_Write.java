package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Read_Write {

	/*
	 *  high level class
	 *    string char word line...
	 *  low level class...
	 *  bytes....
	 * 
	 * */
	public static void main(String[] args) {

System.out.println(".....");
		File file = new File("Hello.txt");
	//file.createNewFile();
		try {
			FileWriter writer = new FileWriter(file,true);
			writer.write("Hello this is new file....");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}