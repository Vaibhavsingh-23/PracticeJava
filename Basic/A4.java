class A4{
	public static void main(String[] args){
		String x = "ram";
		String a = new String("ram");
		String b = new String(x);
		String c = "ram";
		String d = "ram";

		int i;
		int j;

		System.out.println(c==d);
		System.out.println(a==b);
		System.out.println(x==c);
		System.out.println(x==d);
		System.out.println(i==j);

		
System.out.println("-------------------------------------------------------------");
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);

		System.out.println(c);
		System.out.println(d);
}
}