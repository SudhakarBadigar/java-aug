package variable1;

public class var2 {
	public static void main(String[] args) {
		float a[]= {10,20,30.5f,'k',};
		System.out.println(a[3]);//107.0 because data type is float.
	int size [];
	size = new int[5];
	size[0]= 10;
	size[1]=20;
	size[2]=30;
	
	
	System.out.println(size[0]);
	System.out.println(size[4]);
	System.out.println("...........");
	
	String []names;
	names = new String[5];
	names[0]= "rama";
	names[1] = "krishna";
	//names=new String[10];
	
	System.out.println(names[0]);
	System.out.println(names[1]);
	System.out.println(names[4]);
	System.out.println(names);
	System.out.println(names.length);
	//System.out.println(names[10]);
	 float flopoint[];
	 
	 String fname = "guru  deva";
	 System.out.println(fname.length());
	 System.out.println("............");
	 
	 //anonymous array(or)nameless array
//	 int b[];
//	 b=new int[3];
	 int b[]= new int[3];
	 b[0]=10;
	 byte c = 100;
	 b[1]=c;
	 b[2]='d';
	 
	 System.out.println(b[0]);
	 System.out.println(b[1]);
	 System.out.println(b[2]);
	 System.out.println(b[3]);
	 
	 
	}
}
