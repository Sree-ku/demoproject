package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorexample {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("apple");
		array.add("manago");
		array.add("banana");
		array.add("fig");
		Iterator a=array.iterator();
		while(a.hasNext()){
			System.out.println(a.next());// TODO Auto-generated method stub
	}
		a.remove();
	System.out.println(array);

}
}
