package variable1;
class AnonymousArray{
	public static void main(String[] args)
	{
		 display(new int[]{10,20,30,40,50});
	}
	public static void display(int[] a) {
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		System.out.println(a.length);
	}
}