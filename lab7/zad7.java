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

/*
Napisz klase NrTelefoniczny, posiadajaca 2 pola: nrkierunkowy i nrTelefonu i implementujaca interfejs Comparable.
Nastepnie utworz abstrakcyjna klase Wpis a nastepnie dziedziczace z niej klasy Osoba i Firma. Klasa Wpis ma abstrakcyjna metode opis,
ktora opisuje dany wpis. Byc moze ma rowniez inne metody abstrakcyjne lub nie w miare potrzeb. Klasa Osoba ma zawierac informacje o
imieniu, nazwisku, adresie i (w tym nrTelefonu). Klasa Firma ma miec nazwe i adres( w tym NrTelefonu).
Utworz kilka obiektow klasy Osoba i kilka obiektow klasy Firma i umiesc je w kontenerze TreeMap, poslugujac sie jako kluczem
numerem telefonicznym. Nastepnie wypisz utworzona w ten sposob ksiazke telefoniczna za pomoca iteratora.
*/

public interface Comparable {
	long secondsElapsedSince(Date date);
}




public class zad7
{


	public static void main(String []args) {

		NrTelefoniczny numer1= new NrTelefoniczny();
		Osoba osoba1= new Osoba();
		Firma firma1= new Firma();


	}

}

public class NrTelefoniczny implements Comparable<NrTelefoniczny> {

	public int compareTo(Patient o) {
		return 0;
	}
	private string nrkierunkowy;
	private string nrTelefonu;
	public class Comparable_imp implements Comparable {
		public int compareTo(NrTelefoniczny nr) {
			return nr.nrTelefonu;
		}
	}//iplementation of interface



}


public abstract class Wpis{
	public abstract long Opis(String s) {

	}

}
public class Osoba extends Wpis{
	v string name;
	private string surname;
	private string adress;
	private string numer_tel;

}
public class Firma extends Wpis{
	private string name;
	private string adress;
	private string numer_tel;

}