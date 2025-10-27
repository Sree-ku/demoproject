package accessmodified2;

import accessModified.Accessmodified1;

public class Access3 extends Accessmodified1 {
	


public static void main(String args[]) {
	Access3 object =new Access3();
	object.publicmethod();
	//object.privatemethod();
	//object.defaultmethod();
	object.protectedmethod();

}
}
