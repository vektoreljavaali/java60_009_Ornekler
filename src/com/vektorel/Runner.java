package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// e�er de�i�kenler kodlama i�inde method,d�ng� ko�ul
		// i�inde tan�mlanm�yor ise en tepede tan�mlay�n.
		Scanner sc;
		int secim=0;
		
		do {
			System.out.println("*************************");
			System.out.println("* ��renci Takip Sistemi *");
			System.out.println("*************************");
			System.out.println("1- ��renci Ekleme");
			System.out.println("2- Not Ekleme");
			System.out.println("3- Not D�zeltme");
			System.out.println("4- ��renci Listesi");
			System.out.println("5- ��renci Silme");
			System.out.println("6- S�n�f Not Listesi");
			System.out.println("0- �IKI�");
			System.out.println();
			System.out.print("Se�iniz....: ");
			sc = new Scanner(System.in);
			secim = sc.nextInt();
			switch (secim) {
			case 1:	break;
			case 2:	break;
			case 3:	break;
			case 4:	break;
			case 5:	break;
			case 6:	break;
			case 0: System.out.println("�IKI� YAPILDI");	break;
			default: System.out.println("Ge�ersiz se�im yapt�n�z.");
				break;
			}
		}while(secim!=0); // D�ng� devam etmesi i�in : parantez i�i true olacak
		
		

	}// Main Sonu
}// Class Sonu
