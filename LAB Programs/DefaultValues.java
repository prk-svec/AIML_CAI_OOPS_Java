public class DefaultValues {

     byte b;
     short s;
     int i;
     long l;
     float f;
     double d;
     char c;
     boolean bool;

    public static void main(String[] args) {
		
		int a;
		a=10;
		System.out.println(a);
		
		
		DefaultValues d = new DefaultValues();

        System.out.println("Default value of byte    : " + d.b);
        System.out.println("Default value of short   : " + d.s);
        System.out.println("Default value of int     : " + d.i);
        System.out.println("Default value of long    : " + d.l);
        System.out.println("Default value of float   : " + d.f);
        System.out.println("Default value of double  : " + d.d);
        System.out.println("Default value of char    : " + d.c);
        System.out.println("Default value of boolean : " + d.bool);
        
		/*
		 * if (c == '\u0000') {
		 * System.out.println("Default value is the null character (\\u0000)"); }
		 */
    }
}