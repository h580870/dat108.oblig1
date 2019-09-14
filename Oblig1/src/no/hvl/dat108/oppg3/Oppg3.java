package no.hvl.dat108.oppg3;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



public class Oppg3 {
	
// Legger til kroner til lønn
	public static Function<Ansatt, Integer> kroneTillegg(int kronetillegg) {
		return  a -> a.getAarslonn() + kronetillegg;
	}
	
	// Legger antall prosent til lønn
	public static Function<Ansatt, Integer> prosentTillegg(int prosenttillegg) {
		return  a -> a.getAarslonn() * prosenttillegg/100 + a.getAarslonn();
	}
	
	// Sjekker om predikatet er oppfyllt og deretter ligger til prosenttillegg
	public static Function<Ansatt, Integer> sjekkProsTillegg (Predicate<Ansatt> sjekk, int tillegg) {
		 return p -> {
			 if(sjekk.test(p)) {
				 return prosentTillegg(tillegg).apply(p);
			 }
			 return p.getAarslonn();
		 };
	}
	// Sjekker om predikatet er oppfyllt og deretter ligger til kronetillegg
	public static Function<Ansatt, Integer> sjekkKronTillegg (Predicate<Ansatt> sjekk, int tillegg) {
		 return p -> {
			 if(sjekk.test(p)) {
				 return kroneTillegg(tillegg).apply(p);
			 }
			 return p.getAarslonn();
		 };
	}
	
	
	
	//Metode som bruker functionene som er laget
	
	public static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> beregn) {
		for(Ansatt e : ansatte) {
			e.setAarslonn(beregn.apply(e)); 
		}
	
	}

	// Printer ut alle ansatte
private static void skrivUtAlle(List<Ansatt> ansatte) {
	ansatte.forEach(System.out::println);
	//ansatte.forEach(p -> System.out.print(p);
}

	public static void main(String[] args) {
		
		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Darren", "B", Kjonn.Mann, "Gul", 3000),
				new Ansatt("Peter", "D", Kjonn.Mann, "Vape", 1000),
				new Ansatt("Abduhalli", "Hassan", Kjonn.Kvinne, "Daddy", 100)
				);
		
		skrivUtAlle(ansatte);
		System.out.println();
		
		// Prosenttillegg
		lonnsoppgjor(ansatte, prosentTillegg(5));
		System.out.println();
		//Kronetillegg
		lonnsoppgjor(ansatte, kroneTillegg(1000));
		
		
		System.out.println();
		
		// Sjekker om ansatt er mann og deretter regner kronetillegg
		lonnsoppgjor(ansatte, sjekkKronTillegg(a -> a.getKjonn() == Kjonn.Mann, 5));
		
		System.out.println();
		
		// Sjekker om ansatt har en viss lønn og deretter legger til prosenttillegg
		lonnsoppgjor(ansatte, sjekkProsTillegg(a -> a.getAarslonn() < 1000, 5));
		skrivUtAlle(ansatte);

	}

}
