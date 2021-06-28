package com.nit.screening.lab;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AllIOStreamClassDemo {

	// DEMO FOR INPUTSTREAM
	public static void readingInput() {
		try {
			FileInputStream fis=new FileInputStream("G:\\input.txt");
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}


	public static void outputStream() throws IOException {
		try {
			FileInputStream fis=new FileInputStream("G:\\input.txt");
			int i=0;
			FileOutputStream fos=new FileOutputStream("G:\\output.txt");

			while( (i = fis.read()) != -1) {
				fos.write(i);
			}
			System.out.println("finished copying");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void byteArrayInputStream() {
		byte arr[]= {65,66,67,68};
		ByteArrayInputStream bis=new ByteArrayInputStream(arr);
		int k;
		while((k = bis.read()) != -1) {
			char ch=(char)k;
			System.out.println(ch);
		}
	}

	public static void byteArrayOutputStream() throws IOException {

		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		FileOutputStream fos=new FileOutputStream("G:\\bufferopstream.txt");
		String st="Tanmay";
		byte i=0;
		byte[] arr=st.getBytes();
		bos.write(arr);
		bos.writeTo(fos);
		//	    System.out.println(bos.toString());
		//bos.flush();	
		System.out.println("Finish");
	}

	public static void filterInputStream() throws IOException{
		FileInputStream fis=new FileInputStream("G:\\filteris.txt");
		FilterInputStream filterIS=new BufferedInputStream(fis);
		int i=0;
		while((i = filterIS.read()) != -1) {
			System.out.print((char)i);
		}
	}

	public static void filterOutputStream() throws IOException {
		FileOutputStream fos=new FileOutputStream("G:\\filteros.txt");
		java.io.FilterOutputStream filterOS=new java.io.FilterOutputStream(fos);
		String s="This is FilterOutputStream";
		byte arr[]=s.getBytes();
		filterOS.write(arr);
		System.out.println("Finished");		
	}

	public static void objectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException {
		String str = "Hello";  
		byte[] barray = {'j', 'a', 'v', 'a', 'T', 'p', 'o', 'i', 'n', 't'};  
		try {  
			// create a new file with an ObjectOutputStream  
			FileOutputStream outstream = new FileOutputStream("G:\\file1.txt");  
			ObjectOutputStream objoutstream = new ObjectOutputStream(outstream);  

			// writing objects str and barray to objectoutputstream  
			objoutstream.writeObject(str);  
			objoutstream.writeObject(barray);  

			// create an ObjectInputStream for the file we created before  
			ObjectInputStream objinstream = new ObjectInputStream(new FileInputStream("G:\\file1.txt"));  

			// read and print an object and cast it as the string  


			System.out.println("" + (String) objinstream.readObject());  
			byte[] read1 = (byte[]) objinstream.readObject();  
			String s2 = new String(read1);  
			System.out.println("" + s2);  
			int rr = objinstream.read(read1, 2, 7);  
			System.out.println(" No of bytes read  :" +rr);  
		} catch (Exception ex) {  
			ex.printStackTrace();  
		}  
	}  

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//readingInput();
		//outputStream();

		//byteArrayInputStream();
		//byteArrayOutputStream();

		//filterInputStream();
		//filterOutputStream();

		objectInputStream();
	}

}
