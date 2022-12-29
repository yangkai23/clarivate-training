package day7;
import java.io.*;
public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f=new File("Test.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
}
