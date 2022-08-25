package variable1;
public class Instancevar{
	int account_bal_amount = 500;
	static String bank_name ="SBI";
	int account_id =101;
	int a = 10;
	public static void main (String [] args) {
		int a=20;
		System.out.println(a);
		Instancevar v1 = new Instancevar();
		System.out.println(bank_name);
		System.out.println(v1.account_bal_amount);
		System.out.println(v1.account_id);
		System.out.println(v1.a);
	}
}