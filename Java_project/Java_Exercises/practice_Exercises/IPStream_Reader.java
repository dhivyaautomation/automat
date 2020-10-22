package practice_Exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class IPStream_Reader {

	public static void main(String[] args) throws IOException {
		read_ip_stream();
		//read_ip_with_scanner();
		//read_ip_stream_read();
		output();
	}
	
	//InputStream  This is used to read (sequential) data from a source.REFER TTORIALS POINT
	
	public static void read_ip_stream() throws IOException {
	
		//Initiating inputstream  to point the file location
			InputStream ip = new FileInputStream("E:\\Eclipse_programs\\Java_project\\Java_Exercises\\practice_Exercises\\Text");
	//initialising inputstraemreader to read the file
			InputStreamReader isReader = new InputStreamReader(ip);
			
	/*BufferedReader reads a couple of characters from the specified stream and stores it in a buffer. This makes input faster.
InputStreamReader reads only one character from specified stream and remaining characters still remain in the stream.*/
			
	//The file contents is then given to the buffered reader
			BufferedReader bufreader = new BufferedReader (isReader);
	//sb is initialised to store the read input
	/*StringBuffer in java is used to create modifiable String objects. 
	 * This means that we can use StringBuffer to append, reverse, replace, concatenate
	 *  and manipulate Strings or sequence of characters.*/
			
			StringBuffer sb = new StringBuffer();
			String name;
			while ((name = bufreader.readLine())!= null)
			{
				sb.append(name);
			}
			System.out.println(sb.toString());
	}
	
	//Read data from the file with the help of Scanner
	public static void read_ip_with_scanner() throws FileNotFoundException,IOException {
			InputStream ip = new FileInputStream("E:\\Eclipse_programs\\Java_project\\Java_Exercises\\practice_Exercises\\Text");
			Scanner t = new Scanner (ip);
			StringBuffer sb = new StringBuffer();
			while (t.hasNext())
			{
				sb.append(t.nextLine());
			}
			System.out.println(sb);
	}
	
	//Read data from file using InputStraemReader read() method
	public static void read_ip_stream_read() throws IOException
	{
		File file = new File ("E:\\Eclipse_programs\\Java_project\\Java_Exercises\\practice_Exercises\\Text");
		InputStream ip = new FileInputStream(file);
		InputStreamReader r = new InputStreamReader (ip);
		//BufferedReader buff = new BufferedReader(r);
		//Creating a character array
		char charArray [] = new char[(int) (file.length())];
		//Reading the contents of the reader
		r.read(charArray);
		//Converting charArray to string
		String contents =new String (charArray);
		System.out.println(contents);
	}
	
	public static void output() throws IOException {
		File file = new File ("E:\\Eclipse_programs\\Java_project\\Java_Exercises\\practice_Exercises\\Text");
		FileWriter out = new FileWriter(file);
		System.out.println();
		String sentence = "This is an example of file writer output. It writes string of words rather than character bytes";
		out.write(sentence);
		
		OutputStream o1 = new FileOutputStream("E:\\Eclipse_programs\\Java_project\\Java_Exercises\\practice_Exercises\\Text1");
		Writer outputStreamWriter = new OutputStreamWriter(o1);
		outputStreamWriter.write("Hello.. This is written by using outputstreamwriter Class");
		out.close();
		outputStreamWriter.flush(); //flushes the stream
		outputStreamWriter.write("This is the second line of text");
		outputStreamWriter.close();//flushes and then closes the stream. this is imp to get the op.
		
	}
	
			
	}

