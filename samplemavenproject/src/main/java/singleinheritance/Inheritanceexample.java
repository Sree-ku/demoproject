package singleinheritance;

public class Inheritanceexample {
  int a=5;
  int b=10;
  public Inheritanceexample() {
	  System.out.println("Parent class constructor");
  }
  public Inheritanceexample(String s){
	 this();
	  System.out.println("This is a paramaterized constructor:"+s);
	  
  }
  public void sum() {
	  int c=a+b;
	  System.out.println(c);
  }
		

}
		




