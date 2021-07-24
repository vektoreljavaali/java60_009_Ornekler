package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// eðer deðiþkenler kodlama içinde method,döngü koþul
		// içinde tanýmlanmýyor ise en tepede tanýmlayýn.
		Scanner sc;
		int secim=0;
		
		do {
			System.out.println("*************************");
			System.out.println("* Öðrenci Takip Sistemi *");
			System.out.println("*************************");
			System.out.println("1- Öðrenci Ekleme");
			System.out.println("2- Not Ekleme");
			System.out.println("3- Not Düzeltme");
			System.out.println("4- Öðrenci Listesi");
			System.out.println("5- Öðrenci Silme");
			System.out.println("6- Sýnýf Not Listesi");
			System.out.println("0- ÇIKIÞ");
			System.out.println();
			System.out.print("Seçiniz....: ");
			sc = new Scanner(System.in);
			secim = sc.nextInt();
			switch (secim) {
			case 1:	break;
			case 2:	break;
			case 3:	break;
			case 4:	break;
			case 5:	break;
			case 6:	break;
			case 0: System.out.println("ÇIKIÞ YAPILDI");	break;
			default: System.out.println("Geçersiz seçim yaptýnýz.");
				break;
			}
		}while(secim!=0); // Döngü devam etmesi için : parantez içi true olacak
		
		

	}// Main Sonu
}// Class Sonu
