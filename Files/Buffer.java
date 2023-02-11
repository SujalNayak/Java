package Files;

import java.io.BufferedReader;
import java.io.FileReader;
public class Buffer {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Hello.txt")); 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
