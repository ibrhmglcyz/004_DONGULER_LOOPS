package com.vektorel;

import java.util.Scanner;

public class RunnerWhile {

	public static void main(String[] args) {
		
		
		// Sistemden cikis yapip yapmama konusunu kullaniciya soran program
		
		String secim = "H";
		
		while (!secim.equals("E")) { //unlem isareti secimi degilledigi icin dongu donmeye devam eder. E yazmadigi surece programdan cikis yapmaz.
			System.out.println();
			System.out.println("********************");
			System.out.println("Sisteme Hosgeldiniz.");
			System.out.println();
			System.out.println("Cikis yapmak istiyor musunuz?(E/H)");
			Scanner sc = new Scanner(System.in);
			secim = sc.nextLine();
		}

		System.err.println("PROGRAMDAN CIKIS YAPILDI");
		
	}

}
