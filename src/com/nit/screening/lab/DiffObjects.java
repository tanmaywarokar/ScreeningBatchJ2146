package com.nit.screening.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiffObjects {

	public static void newWord() {
		@SuppressWarnings("unused")
		Employee e1=new Employee(12, "Tanmay");
	}
	
	
	public static void newInstanceMethod() throws InstantiationException, IllegalAccessException {
		
		Employee e2=Employee.class.newInstance();
		System.out.println(e2.hashCode());	
	}
	
	public static void cloneMethod() throws CloneNotSupportedException {
		Employee e3=new Employee(1,"Tanmay");
		Employee e4=(Employee)e3.clone();
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e4.empId+". "+e4.empName);
	}
	
	public static void deserializationMethod() throws ClassNotFoundException {
		Employee object = new Employee(8, "Tejas");   
		String filename = "Demofile.ser";       
		/*-----------------Serialization----------*/  
		try  
		{      
		FileOutputStream file = new FileOutputStream(filename);  
		ObjectOutputStream out = new ObjectOutputStream(file);     
		out.writeObject(object);            
		out.close();                    
		file.close();                    
		System.out.println("Object serialized");   
		}   
		catch(IOException e)   
		{   
		e.printStackTrace();  
		}   
		
		/*-----------------Deserialization--------*/  
		Employee obj;
		try  
		{      
		FileInputStream file = new FileInputStream(filename);   
		ObjectInputStream is = new ObjectInputStream(file);   
		obj = (Employee)is.readObject();        
		is.close();                     //closes the ObjectInputStream  
		file.close();                   //closes the file  
		System.out.println("Object deserialized ");   
		System.out.println("Id = " + obj.empId);   
		System.out.println("Name = " + obj.empName);   
		}   
		catch(IOException e)   
		{   
		System.out.println("IOException is caught");   
		}   
		
	}
	
	public static void newInsCons() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Employee> con=Employee.class.getDeclaredConstructor();
		Employee e=con.newInstance();
		System.out.println(e);
		
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
       //DiffObjects.newWord();
		//DiffObjects.newInstanceMethod();
		//DiffObjects.cloneMethod();
		//DiffObjects.deserializationMethod();
		DiffObjects.newInsCons();
	}

}
