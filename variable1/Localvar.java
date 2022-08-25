package variable1;
public class Localvar{
	static String bank ;
	//static and non static jvm will keep default value 0 for int null for strings.
	int acc_bal;
	public static void main(String[] args) {
		//local variables must be initialize or else compile error occurs
		int acc_holder = 001;
		
		System.out.println(bank);
		Localvar l1 = new Localvar();
		System.out.println(l1.acc_bal);
		System.out.println(acc_holder);
	}
}