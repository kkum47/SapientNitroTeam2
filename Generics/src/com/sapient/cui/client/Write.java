package com.sapient.cui.client;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("Park street");
		address.setCountry("India");
		try {
			FileOutputStream fout = new FileOutputStream("D:\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
