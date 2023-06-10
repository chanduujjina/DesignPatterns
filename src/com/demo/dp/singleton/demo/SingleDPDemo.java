package com.demo.dp.singleton.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.dp.singleton.EarlySingleton;

public class SingleDPDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//requesting for the instance first time
		EarlySingleton instance1 = EarlySingleton.getInstance();
		
		System.out.println(instance1.hashCode());
		
		//requesting for the instance 2nd time
		
		EarlySingleton instance2 = EarlySingleton.getInstance();
		
		System.out.println(instance2.hashCode());
		
		//cloning instance for creating new object
		
		//EarlySingleton instance3 = (EarlySingleton) instance2.clone();
		//System.out.println(instance3.hashCode());
		
		serizeObjectData();
		EarlySingleton instance4 = deserlizeData();
		System.out.println(instance4.hashCode());

	}
	
	  private static EarlySingleton deserlizeData() {
		  EarlySingleton specimen = null;
			try (FileInputStream fileInputStream = new FileInputStream("earlySingletonSer.txt");
					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
				 specimen = (EarlySingleton)objectInputStream.readObject();
				//System.out.println(specimen.hashCode());
				
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return specimen;
			
		}
	  
		private static void serizeObjectData() {
			
			try (FileOutputStream fileOutputStream = new FileOutputStream("earlySingletonSer.txt");
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
				EarlySingleton instance = EarlySingleton.getInstance();
				objectOutputStream.writeObject(instance);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	    

}
