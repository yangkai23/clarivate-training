package day7;
import java.io.*;
public class FileHAndling {
	public static void main(String[] args) throws IOException {
		File f=new File("Demo.txt");
		FileReader fr=new FileReader("Demo.txt");
		FileWriter fw=new FileWriter(f,true);
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();}
		fw.write("parker", 1, 3);
		fr.close();
		fw.close();
	}
}
