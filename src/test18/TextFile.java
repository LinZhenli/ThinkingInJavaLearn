package test18;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

//Static functions for reading and writing text files as
//a single and treating a file as an ArrayList.
public class TextFile extends ArrayList<String>{
	//Read a file as a single string:
	public static String read(String fileName) throws IOException {
		StringBuilder sb=new StringBuilder();

			BufferedReader in=new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
			try {
				String s;
				while((s=in.readLine())!=null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}

		return sb.toString();
	}
	
	//Write a single file in one method call:
	public static void write(String fileName,String text) {
		try {
			PrintWriter out =new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				out.print(text);
			} finally {
				out.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Read a file,split by any regular expression:
	public TextFile(String fileName, String splitter) throws IOException {
		super(Arrays.asList(read(fileName).split(splitter)));
	}
	public TextFile(String fileName) throws IOException {
		this(fileName,"\n");
	}
	public void write(String fileName) throws FileNotFoundException {

			PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				for(String item:this)
					out.println(item);
			} finally{
				out.close();
			}

	}
	//Simple test:
	public static void main(String[] args) throws IOException {
		String file=read("src\\util\\TextFile.java");
		write("test.txt",file);
		TextFile text=new TextFile("test.txt");
		text.write("test2.txt");
		
		//Break into unique sorted list of words:
		TreeSet<String> words=new TreeSet<String>(new TextFile("src/util/TextFile.java","\\W+"));
		//Display the capitalized words:
		System.out.println(words.headSet("a"));
		
		FileReader fr = null;
		try {
			fr=new FileReader(new File("F:\\Documents\\workspace\\ThinkingInJava\\src\\util\\TextFile.java"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int ch=fr.read();
			while(ch!=-1) {
				//System.out.print((char)ch);
				ch=fr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
		}
	}
}

//½áÎ²ÖÐÎÄ
