package body_Mass_index;

import java.util.Scanner;
import java.text.DecimalFormat;

public class body_Mass_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	    String fraction = "##.##";
	    
	    
		System.out.println("Boynuzu Giriniz = ");
		double cm = scan.nextInt();
		System.out.println("");
		System.out.println("Kilonuzu Giriniz = ");
		double kg = scan.nextInt();
		
		cm=cm/100;
		
		double endeks  = kg/(cm*cm);
		System.out.println("");
		System.out.println("Boyunuz = " + cm);
		System.out.println("");
	    System.out.println("Kilonuz = " + kg);
	    System.out.println("");
		System.out.println("VKİ = " +  new DecimalFormat(fraction).format(endeks));
		
		if(endeks < 20) {
			System.out.println("");
			System.out.println("Zayıfsınız Kilo Almanız Gerek");
		}
		
		else if(endeks >= 20 && endeks < 25) {
			System.out.println("");
			System.out.println("Kilonuz Normal");
		}
		
		else if(endeks >= 25 && endeks < 30) {
			System.out.println("");
			System.out.println("Kilolusunuz");
		}
		
		else if(endeks >= 30 && endeks < 35) {
			System.out.println("");
			System.out.println("Riskli Durumdasınız");
		}
		
		else {
				System.out.println("");
				System.err.println("Obezsiniz");
			
		}

	}

}
