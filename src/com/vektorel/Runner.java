package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// e�er de�i�kenler kodlama i�inde method,d�ng� ko�ul
		// i�inde tan�mlanm�yor ise en tepede tan�mlay�n.
		Scanner sc;
		int secim=0,sinifmevcudu=0;
		// ��renci Bilgileri: okulno, ad soyad, s�n�f, vize, final
		// �ok boyutlu diziler, matris kavram�,
		// Tablo, Listes gibi bilgileri tutmak i�in kullan�l�r.
		// birinci k�s�m sat�rlar�, ikinci k�s�m s�tunlar� ifade eder,
		// genel bir zorunluluk de�ildir.
		String[][] sinifListesi=null; //= new String[100][5];
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
			System.out.println("7- S�n�f Belirleme");
			System.out.println("8- Eksik Bilgi Listesi");
			System.out.println("0- �IKI�");
			System.out.println();
			System.out.print("Se�iniz....: ");
			sc = new Scanner(System.in);
			secim = sc.nextInt();
			switch (secim) {
			case 1:	
				if(sinifmevcudu==0)
					System.err.println("UYARI!!! L�tfen S�n�f mevcudunu belirleyiniz(Se�im-7)");
				else {
					sinifListesi = new String[sinifmevcudu][5];
					// Scanner da bulunan bir yap� nedeniyle new i�lemi
					// yapmadan kullan�mlarda, t�r de�i�imleri soruna 
					// yol a�ar ve al�nan veriler de bo�luklar olu�ur.
					sc = new Scanner(System.in);
					for(int i=0;i<sinifmevcudu;i++) {
						System.out.print((i+1)+". ��rencinin Okul No.......: ");
						String okulno = sc.nextLine();
						System.out.print((i+1)+". ��rencinin Ad Soyad......: ");
						String adsoyad = sc.nextLine();
						System.out.print((i+1)+". ��rencinin S�n�f�........: ");
						String sinif = sc.nextLine();
						System.out.print((i+1)+". ��rencinin Vize..........: ");
						String vize_notu = sc.nextLine();
						System.out.print((i+1)+". ��rencinin Final.........: ");
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
			case 2:	
				for(int i=0;i<sinifmevcudu;i++) {
					
					sc = new Scanner(System.in);
					System.out.println("��renci..: "+sinifListesi[i][1]);
					System.out.print("Vize Notu...: ");
					sinifListesi[i][3]= sc.nextLine();
					System.out.print("Fina notu...: ");
					sinifListesi[i][4]= sc.nextLine();
					System.out.println("-----------------------------");
				}
				break;
			case 3:	break;
			case 4:
				System.out.println("*******************************");
				System.out.println("****** SINIF L�STES� **********");
				System.out.println("*******************************");				
				System.out.println("Okul No | Ad Soyad    | S�n�f� | Vize | Final");
				
				for(int i=0;i<sinifmevcudu;i++) {
					System.out.print(sinifListesi[i][0]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][1]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][2]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][3]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][4]+" ");System.out.print("	");					
					System.out.println();
				}
				
				System.out.println();	
				
				break;
			case 5:	break;
			case 6:
				System.out.println("��renci Ad�| Not | Durumu");
				for(int i=0;i<sinifmevcudu;i++) {
					System.out.print(sinifListesi[i][1]+"	");
					int vize_notu = Integer.parseInt(sinifListesi[i][3]);
					int final_notu = Integer.parseInt(sinifListesi[i][4]);
					int ortalama = (vize_notu+final_notu)/2;
					System.out.print(ortalama+"	");
					if(ortalama>=50)
						System.out.print("GE�T�");
					else
						System.out.print("KALDI");
					System.out.println();
				}
				
				
				break;
			case 7:
				System.out.print("L�tfen S�n�f Mevcudunu giriniz...: ");
				sinifmevcudu = sc.nextInt();
				break;	
			case 8: 
				System.out.println("*******************************");
				System.out.println("***** Eksik Bilgi L�STES� *****");
				System.out.println("*******************************");				
				System.out.println("Okul No | Ad Soyad    | S�n�f� | Vize | Final");
				
				for(int i=0;i<sinifmevcudu;i++) {
					if(sinifListesi[i][0]=="" ||
					   sinifListesi[i][1]=="" ||
					   sinifListesi[i][2]=="" ||
					   sinifListesi[i][3]=="" ||
					   sinifListesi[i][4]=="" ) {
					System.out.print(sinifListesi[i][0]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][1]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][2]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][3]+" ");System.out.print("	");
					System.out.print(sinifListesi[i][4]+" ");System.out.print("	");					
					System.out.println();
					}
				}
				
				System.out.println();
				break;
			case 0: System.out.println("�IKI� YAPILDI");	break;
			default: System.out.println("Ge�ersiz se�im yapt�n�z.");
				break;
			}
		}while(secim!=0); // D�ng� devam etmesi i�in : parantez i�i true olacak
		
		

	}// Main Sonu
}// Class Sonu
