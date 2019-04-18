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
import java.util.*;
/*
Napisz klase NrTelefoniczny, posiadajaca 2 pola: nrkierunkowy i nrTelefonu i implementujaca interfejs Comparable.
Nastepnie utworz abstrakcyjna klase Wpis a nastepnie dziedziczace z niej klasy Osoba i Firma. Klasa Wpis ma abstrakcyjna metode opis,
ktora opisuje dany wpis. Byc moze ma rowniez inne metody abstrakcyjne lub nie w miare potrzeb. Klasa Osoba ma zawierac informacje o
imieniu, nazwisku, adresie i (w tym nrTelefonu). Klasa Firma ma miec nazwe i adres( w tym NrTelefonu).
Utworz kilka obiektow klasy Osoba i kilka obiektow klasy Firma i umiesc je w kontenerze TreeMap, poslugujac sie jako kluczem
numerem telefonicznym. Nastepnie wypisz utworzona w ten sposob ksiazke telefoniczna za pomoca iteratora.
*/




public class Zad7 {


	public static void main(String[] args) {
		try {
			Osoba Person1 = new Osoba("Marek", "Kart", "Warszawa", new NrTelefoniczny("12", "495341987"));
			Osoba Person2 = new Osoba("John", "Blues", "Warszawa", new NrTelefoniczny("34", "495341987"));
			Osoba Person3 = new Osoba("Tim", "Lopp", "Ciechocinek", new NrTelefoniczny("14", "545987645"));
			Firma Company1 = new Firma("Drutexxx", "Lodz", new NrTelefoniczny("68", "784651324"));
			Firma Company2 = new Firma("Kujawski", "Bialystok", new NrTelefoniczny("77", "454168974"));
			Firma Company3 = new Firma("Holand", "Belgia", new NrTelefoniczny("47", "541687985"));
			TreeMap<NrTelefoniczny, Wpis> TREEMAP = new TreeMap<>();

			TREEMAP.put(Person1.nr,Person1);
			TREEMAP.put(Person2.nr,Person2);
			TREEMAP.put(Person3.nr,Person3);
			TREEMAP.put(Company1.nr,Company1);
			TREEMAP.put(Company2.nr,Company2);
			TREEMAP.put(Company3.nr,Company3);
		

			for (Map.Entry<NrTelefoniczny,Wpis> iterator : TREEMAP.entrySet()){
				Wpis it = iterator.getValue();
				it.Opis();
			}
		}
		catch(Exception exc){
			System.out.println(exc.getLocalizedMessage());
		}
	}


}

