package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// eðer deðiþkenler kodlama içinde method,döngü koþul
		// içinde tanýmlanmýyor ise en tepede tanýmlayýn.
		Scanner sc;
		int secim=0,sinifmevcudu=0;
		// Öðrenci Bilgileri: okulno, ad soyad, sýnýf, vize, final
		// Çok boyutlu diziler, matris kavramý,
		// Tablo, Listes gibi bilgileri tutmak için kullanýlýr.
		// birinci kýsým satýrlarý, ikinci kýsým sütunlarý ifade eder,
		// genel bir zorunluluk deðildir.
		String[][] sinifListesi=null; //= new String[100][5];
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
			System.out.println("7- Sýnýf Belirleme");
			System.out.println("0- ÇIKIÞ");
			System.out.println();
			System.out.print("Seçiniz....: ");
			sc = new Scanner(System.in);
			secim = sc.nextInt();
			switch (secim) {
			case 1:	
				if(sinifmevcudu==0)
					System.err.println("UYARI!!! Lütfen Sýnýf mevcudunu belirleyiniz(Seçim-7)");
				else {
					sinifListesi = new String[sinifmevcudu][5];
					// Scanner da bulunan bir yapý nedeniyle new iþlemi
					// yapmadan kullanýmlarda, tür deðiþimleri soruna 
					// yol açar ve alýnan veriler de boþluklar oluþur.
					sc = new Scanner(System.in);
					for(int i=0;i<sinifmevcudu;i++) {
						System.out.print((i+1)+". Öðrencinin Okul No.......: ");
						String okulno = sc.nextLine();
						System.out.print((i+1)+". Öðrencinin Ad Soyad......: ");
						String adsoyad = sc.nextLine();
						System.out.print((i+1)+". Öðrencinin Sýnýfý........: ");
						String sinif = sc.nextLine();
						System.out.print((i+1)+". Öðrencinin Vize..........: ");
						String vize_notu = sc.nextLine();
						System.out.print((i+1)+". Öðrencinin Final.........: ");
						String final_notu = sc.nextLine();
						System.out.println("----------------------------------------");
						sinifListesi[i][0]=okulno;
						sinifListesi[i][1]=adsoyad;
						sinifListesi[i][2]=sinif;
						sinifListesi[i][3]=vize_notu;
						sinifListesi[i][4]=final_notu;
					}
					
				}
				break;
			case 2:	break;
			case 3:	break;
			case 4:
				System.out.println("*******************************");
				System.out.println("****** SINIF LÝSTESÝ **********");
				System.out.println("*******************************");				
				System.out.println("Okul No | Ad Soyad    | Sýnýfý | Vize | Final");
				
				for(int i=0;i<sinifmevcudu;i++) {
					System.out.print(sinifListesi[i][0]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][1]+" ");System.out.print("		");
					System.out.print(sinifListesi[i][2]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][3]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][4]+" ");System.out.print("	");					
					System.out.println();
				}
				
				System.out.println();	
				
				break;
			case 5:	break;
			case 6:	break;
			case 7:
				System.out.print("Lütfen Sýnýf Mevcudunu giriniz...: ");
				sinifmevcudu = sc.nextInt();
				break;			
			case 0: System.out.println("ÇIKIÞ YAPILDI");	break;
			default: System.out.println("Geçersiz seçim yaptýnýz.");
				break;
			}
		}while(secim!=0); // Döngü devam etmesi için : parantez içi true olacak
		
		

	}// Main Sonu
}// Class Sonu
