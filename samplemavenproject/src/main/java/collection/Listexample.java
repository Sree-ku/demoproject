package collection;

import java.util.ArrayList;
import java.util.List;

public class Listexample {

	public static void main(String[] args) {
	  List<String> l=new ArrayList<String>();
	 l.add("Red");
	 l.add("hello");
	 l.add("hello");
	 l.add("green");

	 System.out.println(l);
	 System.out.println(l.contains("green"));
	 System.out.println(l.indexOf("hello"));
	 System.out.println(l.lastIndexOf("hello"));// TODO Auto-generated method stub
     System.out.println(l.get(1));
     System.out.println(l.size());
     System.out.println(l.isEmpty());
     l.remove(2);
     System.out.println(l);
	}

}
