import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.io.File; 
import java.util.Random;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;
/*
Napisz klase NrTelefoniczny, posiadajaca 2 pola: nrkierunkowy i nrTelefonu i implementujaca interfejs Comparable.
Nastepnie utworz abstrakcyjna klase Wpis a nastepnie dziedziczace z niej klasy Osoba i Firma. Klasa Wpis ma abstrakcyjna metode opis,
ktora opisuje dany wpis. Byc moze ma rowniez inne metody abstrakcyjne lub nie w miare potrzeb. Klasa Osoba ma zawierac informacje o
imieniu, nazwisku, adresie i (w tym nrTelefonu). Klasa Firma ma miec nazwe i adres( w tym NrTelefonu).
Utworz kilka obiektow klasy Osoba i kilka obiektow klasy Firma i umiesc je w kontenerze TreeMap, poslugujac sie jako kluczem
numerem telefonicznym. Nastepnie wypisz utworzona w ten sposob ksiazke telefoniczna za pomoca iteratora.
*/




public class zad7
{


	public static void main(String []args) {
		//NrTelefoniczny numer1= new NrTelefoniczny();
		String nrt= new String("048");
		int nrk=5;
		//String nrk= new String("75555");
		NrTelefoniczny numer1= new NrTelefoniczny(nrt,nrk);
		Osoba osoba1= new Osoba("Marcin","Podborski","Mleczna 5", "0487222");



		Map<NrTelefoniczny, Wpis> ksiazka_tel = new TreeMap<>();
		ksiazka_tel.put(numer1, osoba1);
		//System.out.println(ksiazka_tel.toString());



	}

	public static class NrTelefoniczny implements Comparable<NrTelefoniczny> {

		private String nrkierunkowy;
		private int nrTelefonu;
		public NrTelefoniczny() {


		}
		public NrTelefoniczny(String nrkierunkowy,int nrTelefonu) {

			this.nrkierunkowy = nrkierunkowy;
			this.nrTelefonu=nrTelefonu;
		}


		//iplementation of interface
		//Collections.sort(patients);

		public int compareTo(NrTelefoniczny nr) {
			return nr.nrTelefonu;
		}



	}

/*public class Comparable_imp implements Comparable {
	public int compareTo(NrTelefoniczny nr) {
		return nr.nrTelefonu;
	}
}//iplementation of interface*/




	public abstract class Wpis{
		public abstract String Opis(String s);

	}
	public static class Osoba extends Wpis{
		private String name;
		private String surname;
		private String adress;
		private String numer_tel;

		public String Opis(String s)
		{ return s;}
		public String toString(){
			return "Np. nazwa klasy";
		}
		public Osoba(String name, String surname, String adress, String numer_tel) {
			this.name = name;
			this.surname = surname;
			this.adress = adress;
			this.numer_tel = numer_tel;
		}
	}
	public class Firma extends Wpis{
		private String name;
		private String adress;
		private String numer_tel;

		public String Opis(String s)
		{ return s;}

		public Firma(String name, String adress, String numer_tel) {
			this.name = name;
			this.adress = adress;
			this.numer_tel = numer_tel;
		}
	}

}

