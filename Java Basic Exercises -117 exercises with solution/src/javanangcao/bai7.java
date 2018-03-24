package javanangcao;

import java.util.Scanner;

public class bai7 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		   
		  System.out.print("Nhap so thu nhat: ");
		  int so1 = in.nextInt();
		   
		  for (int i=0; i< 10; i++){
		   System.out.println(so1 + " x " + (i+1) + " = " +(so1 * (i+1))); 
		  }
	}

}
