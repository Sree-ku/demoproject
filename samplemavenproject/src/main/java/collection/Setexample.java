package collection;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Setexample {

	public static void main(String[] args) {
		Set <String> set1=new HashSet<String>();
		set1.add("sree");
		set1.add("jebi");// TODO Auto-generated method stub
		set1.add("suji");
		set1.add("vidhya");
	Set <String> set2=new HashSet<String>();
	set2.add("apple");
	set2.add("mango");
	set2.add("pineapple");
	set2.add("orange");
	set1.addAll(set2);
	System.out.println(set1);
	System.out.println(set1.containsAll(set2));
	}

}
