package com.vektorel;

public class Runner {

	public static void main(String[] args) {
				
		
				//for (int i = 0; i < 10; i++) {
				//	System.out.println(i+1+"- Muhammet");
				//}

				// 1 ile 10 arasinda ki tek sayilarin toplami ??
				
				int toplam=0;
				
				for (int i = 1; i < 10; i+=2) {
					toplam += i;
				}
				System.out.println("Tek Toplam...: "+toplam);

	}

}
