package generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

class Data<T> {
	
	private T value;

	public Data(T value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(value);
	}
	
}
class Sample implements Serializable{
	String s;
	int i;
	double d;
	public Sample(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "s= "+s+"; i= "+i+"; d= "+d;
	}
}

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<Data> result = new Stack<Data>();
		Set<Data> result = new HashSet<>();
		Vector<Data> result = new Stack<Data>();
		
		result.add(new Data(4));
		result.add(new Data(3));
		result.add(new Data(2));
		result.add(new Data(4));*/
		
		
		/*HashMap<Integer, Data> result = new HashMap<Integer, Data>();
		Iterator<Data> iterator = result.iterator();
		Data name;
		while (iterator.hasNext()) {
			name = iterator.next();
			System.out.println(name);
		}
		
		
		result.put(3, new Data(12));
		result.put(5, new Data(52));
		result.put(7, new Data(78));
		result.put(3, new Data(36));*/
		
		try {
			Sample obj1 = new Sample("Hi", -7, 2.7);
			System.out.println("obj1: "+obj1);
			FileOutputStream fos = new FileOutputStream("Store");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.out.println("Exception : "+e);
			System.exit(0);
		}
		
		try {
			Sample obj2;
			FileInputStream fis = new FileInputStream("Store");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj2 = (Sample)ois.readObject();
			ois.close();
			System.out.println("obj2: "+obj2);
		} catch (Exception e) {
			System.out.println("Exception : "+e);
			System.exit(0);
		}
		
	}

}
