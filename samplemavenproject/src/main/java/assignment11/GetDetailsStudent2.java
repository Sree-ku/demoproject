package assignment11;

public class GetDetailsStudent2 extends GetDetailsStudent {
      String address;
      public void getaddress(String a) {
    	  address=a;
      }
      public void display() {
    	  System.out.println("Enter the Studentname:"+name);
    	  System.out.println("Enter the Rollnumber:"+rollnumber);
    	  System.out.println("Enter the Address:"+address);

      }
	public static void main(String[] args) {
		GetDetailsStudent2 object=new GetDetailsStudent2();
		object.getdetails("Sree",123);
		object.getaddress("Kazhuvanttitai");
		object.display();
		// TODO Auto-generated method stub

	}

}
