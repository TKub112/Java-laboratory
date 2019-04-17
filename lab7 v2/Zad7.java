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
		//NrTelefoniczny numer1= new NrTelefoniczny();
/*
		//String nrk= new String("75555");
		NrTelefoniczny numer1 = new NrTelefoniczny("048", "55");
		Osoba osoba1 = new Osoba("Marcin", "Podborski", "Mleczna 5", "0487222");


		//tel = new TreeMap<>();
		Map<NrTelefoniczny, Wpis> ksiazka_tel = new TreeMap<>();
		ksiazka_tel.put(numer1, osoba1);
		for (Map.Entry m : ksiazka_tel.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}*/
		try {
			Osoba OsNr1 = new Osoba("Marek", "Kart", "Warszawa", new NrTelefoniczny("48", "495341987"));
			Osoba OsNr2 = new Osoba("John", "Blues", "Warszawa", new NrTelefoniczny("34", "495341987"));
			Osoba OsNr3 = new Osoba("Tim", "Lopp", "Ciechocinek", new NrTelefoniczny("12", "145987645"));
			Firma FiNr1 = new Firma("Drutexxx", "Lodz", new NrTelefoniczny("68", "784651324"));
			Firma FiNr2 = new Firma("Kujawski", "Bialystok", new NrTelefoniczny("77", "254168974"));
			Firma FiNr3 = new Firma("Holand", "Belgia", new NrTelefoniczny("47", "541687985"));
			TreeMap<NrTelefoniczny, Wpis> tmap = new TreeMap<>();
			tmap.put(OsNr1.nr,OsNr1);
			tmap.put(OsNr2.nr,OsNr2);
			tmap.put(OsNr3.nr,OsNr3);
			tmap.put(FiNr1.nr,FiNr1);
			tmap.put(FiNr2.nr,FiNr2);
			tmap.put(FiNr3.nr,FiNr3);


			for (Map.Entry<NrTelefoniczny,Wpis> iterator : tmap.entrySet()){
				Wpis it = iterator.getValue();
				it.Opis();
			}
		}
		catch(Exception e){
			System.out.println("Error : " + e.getLocalizedMessage());
		}
	}


}

