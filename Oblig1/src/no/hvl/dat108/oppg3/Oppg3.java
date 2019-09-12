package no.hvl.dat108.oppg3;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Oppg3 {
	

	private static Function<Ansatt, Integer> kroneTillegg(int kronetillegg) {
		return  a -> a.getAarslonn() + kronetillegg;
	}
	
	private static Function<Ansatt, Integer> prosentTillegg(int prosenttillegg) {
		return  a -> a.getAarslonn() * prosenttillegg/100 + a.getAarslonn();
	}
	//a.getAarslonn() * prosenttillegg/100 + a.getAarslonn();
	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> beregn) {
		for(Ansatt e : ansatte) {
			e.setAarslonn(beregn.apply(e)); 
		}
	
	}

private static void skrivUtAlle(List<Ansatt> ansatte) {
	ansatte.forEach(System.out::println);
}

	public static void main(String[] args) {
		
		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Darren", "B", Kjonn.Mann, "Gul", 3000),
				new Ansatt("Peter", "D", Kjonn.Mann, "Vape", 100),
				new Ansatt("Abduhalli", "Hassan", Kjonn.Kvinne, "Daddy", 100)
				);
		
		skrivUtAlle(ansatte);
		
		lonnsoppgjor(ansatte, prosentTillegg(5));
		//lonnsoppgjor(ansatte, kroneTillegg(1000));
		
		skrivUtAlle(ansatte);

	}

}
