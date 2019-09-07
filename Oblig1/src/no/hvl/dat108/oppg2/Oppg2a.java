package no.hvl.dat108.oppg2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Oppg2a {

	public static void main(String[] args) {
		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		Collections.sort(listen,(g1, g2) -> Integer.valueOf(g1)-Integer.valueOf(g2));
		
		System.out.println(listen);
	}

}
