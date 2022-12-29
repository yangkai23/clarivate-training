package day1;
public class D1 {
	public static void main(String[] args) {
		char c='s';
			System.out.println(c>65&&c<122?"alphabet":"not a alphabet");
			int a=20;
			int b=40;
//			boolean res=a++ >b&&b++ <a;
//			System.out.println(res+" "+a+" "+b);
			boolean es1=a++ >=20&&b++<a;
			System.out.println(es1+" "+a+" "+b);
	}
}