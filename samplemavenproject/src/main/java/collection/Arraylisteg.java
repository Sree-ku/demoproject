package collection;

import java.util.ArrayList;

public class Arraylisteg {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("apple");
		array.add("manago");
		array.add("banana");
		array.add("fig");
		ArrayList<String> array2=new ArrayList<String>();
		array2.add("Sree");
		array2.add("jebi");
		array2.add("suji");
		array2.add("vidhu");
		array.addAll(array2);
		System.out.println(array);
		System.out.println(array.containsAll(array2));
		
		

	}

}
