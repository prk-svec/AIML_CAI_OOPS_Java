//Develop a JAVA program using String Buffer to delete,
//remove character.

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();		
		
		StringBuffer sb1 = new StringBuffer(str);
		sb1.delete(0, 3);
		
		
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer(str);
		
		sb2.deleteCharAt(1);
		System.out.println(sb2);
	}
}
