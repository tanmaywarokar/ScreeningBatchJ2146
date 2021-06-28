package com.nit.screening.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ReadWriteFile {

	public static void readWriteData(String str) throws ClassNotFoundException {
		String filename = "Demo.ser";       
		/*-----------------Serialization----------*/  
		try  
		{      
		FileOutputStream file = new FileOutputStream(filename);  
		ObjectOutputStream out = new ObjectOutputStream(file);     
		out.writeObject(str);            
		out.close();                    
		file.close();                    
		System.out.println("Object serialized");   
		}   
		catch(IOException e)   
		{   
		e.printStackTrace();  
		}   
		
		/*-----------------Deserialization--------*/  
		String st;;
		try  
		{      
		FileInputStream file = new FileInputStream(filename);   
		ObjectInputStream is = new ObjectInputStream(file);   
		st= (String)is.readObject();        
		is.close();                     //closes the ObjectInputStream  
		file.close();                   //closes the file  
		System.out.println("Object deserialized ");   
		System.out.println(st); 
		}   
		catch(IOException e)   
		{   
		System.out.println("IOException is caught");   
		}   
		
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Enter Data:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        readWriteData(str);
	}

}
