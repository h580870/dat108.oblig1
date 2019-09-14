package no.hvl.dat108.oppg4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import no.hvl.dat108.oppg3.Ansatt;
import no.hvl.dat108.oppg3.Kjonn;

public class Oppg4 {

	private static void skrivUtAlle(List<Ansatt> ansatte) {
		ansatte.forEach(System.out::println);
		//ansatte.forEach(p -> System.out.print(p);
	}

		public static void main(String[] args) {
			
			List<Ansatt> ansatte = Arrays.asList(
					new Ansatt("Darren", "B", Kjonn.Mann, "Sjef", 100),
					new Ansatt("Peter", "D", Kjonn.Kvinne, "Vape", 3000),
					new Ansatt("Abduhalli", "Hassan", Kjonn.Kvinne, "Daddy", 8000000)
					);
			
			skrivUtAlle(ansatte);
			System.out.println();
			
			//oppgave a)
			List<String> etternavnene = ansatte.stream()
					.map(p -> p.getEtternavn())
					.collect(Collectors.toList());
			
			System.out.println(etternavnene);
			
			System.out.println();
			
			//Oppgave b)
			long antallK	= ansatte.stream()
					.filter(p -> p.getKjonn() == Kjonn.Kvinne)
					.count();
			
			/*int antallK = ansatte.stream()
					.filter(p -> p.getKjonn() == Kjonn.Kvinne)
					.mapToInt(p -> 1)
					.sum();*/
			
			System.out.println(antallK);
			
			System.out.println();
			
			double snitt = ansatte.stream()
					.filter(a -> a.getKjonn() == Kjonn.Kvinne)
					.collect(Collectors.averagingInt(a -> a.getAarslonn()));
			
			System.out.println(snitt);
			System.out.println();
			
			//Oppgave d)
//			ansatte = ansatte.stream()
//					.filter(p -> p.getStilling() == "Sjef")
//					.forEach(p -> p.setAarslonn(50));
					
			ansatte.stream()
			.filter(p -> p.getStilling().toUpperCase().contains("SJEF"))
			.forEach(p -> p.setAarslonn(p.getAarslonn()/100*107 ) );
			
			skrivUtAlle(ansatte);
			
			System.out.println();
			
			//Oppgave e)
			boolean sjekk = ansatte.stream()
					.anyMatch(p -> p.getAarslonn() > 800000);
			
			System.out.println(sjekk);
			
			System.out.println();
			
			//Oppave f)
			ansatte.stream()
			.forEach(System.out::println);
			
			System.out.println();
			
			//Oppgave g)
			// lager en variabel som holder laveste lønn
			int lavLonn = ansatte.stream()
					.min(Comparator.comparing(Ansatt::getAarslonn))
					.map(Ansatt::getAarslonn).get();
			
			// Finner de med lav lønn og skriver dem ut.
			ansatte.stream()
					.filter(p -> p.getAarslonn() <= lavLonn)
					.forEach(System.out::println);
			
			
			// Oppgave h)
			int heltall = ansatte.stream()
					.filter(p -> p.getAarslonn() < 1000 && p.getAarslonn() % 3 == 0 || p.getAarslonn() % 5 == 0)
					.mapToInt(p -> p.getAarslonn()) //Gjør om til int slik at vi kan bruke sum() som summerer årslønn.
					.sum();
						
			
				System.out.print(heltall);
				
			
			
			
			
			
			
				
}
}