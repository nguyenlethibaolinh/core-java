package javanangcao;

import java.util.Scanner;

public class bai6 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		   
		  System.out.print("Nhap so thu nhat: ");
		  int so1 = in.nextInt();
		   
		  System.out.print("Nhap so thu hai: ");
		  int so2 = in.nextInt();
		   
		 
		  System.out.println(so1 + " + " + so2 + " = " + (so1 + so2));
		   
		  System.out.println(so1 + " - " + so2 + " = " +  (so1 - so2));		  
		   
		  System.out.println(so1 + " x " + so2 + " = " + (so1 * so2));
		  		   
		  System.out.println(so1 + " / " + so2 + " = " +  (so1 / so2));
		  		 
		  System.out.println(so1 + " mod " + so2 + " = " + (so1 % so2));
		  
	}

}
