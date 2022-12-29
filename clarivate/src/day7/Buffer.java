package day7;

import java.io.*;

public class Buffer {
	public static void main(String[] args) throws IOException {
		File f=new File("Test.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.exists());
		BufferedReader br=new BufferedReader(new FileReader(f));
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s+"k");
			s=br.readLine();
		}
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
	
		
		
		bw.write("Analytics");
		bw.newLine();
		bw.flush();
		bw.close();
	
	}
	
}
