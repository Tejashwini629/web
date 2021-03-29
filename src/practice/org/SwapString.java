//swasp string program
package practice.org;

public class SwapString {
	public static void main(String[] args) {
		String a="java";
		String b="tpoint";
		a=a+b;  //javatpoint  
		int lena=a.length();
		int lenb=b.length();
		//0,(10-6=4)
		b=a.substring(0,lena-lenb);//java
		a=a.substring(b.length());//tpoint
		System.out.println("after swapping" +a+" "+b);
	}
}
