package no.hvl.dat108.oppg2;

import java.util.function.BiFunction;

public class Oppg2b {
	
	
	
	/*
	public static int beregn(int a, int b, String operator) {
		BiFunction<Integer, Integer, Integer> summer = (d, g) -> d + g;
		BiFunction<Integer, Integer, Integer> stoerst = (d, g) -> Math.max(d, g);
		BiFunction<Integer, Integer, Integer> differanse = (d, g) -> Math.abs(d - g);
		 
		int svar = 0;
		if (operator == "summer") {
			svar= summer.apply(a, b);
		} else if (operator == "stoerst") {
			svar= stoerst.apply(a, b);
		} else if (operator == "differanse") {
			svar= differanse.apply(a, b);
		}
		
		
		return svar;
		
	}*/
	

	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> regn) {
		
		
		return regn.apply(a, b);
		
	}

	public static void main(String[] args)  {
		
		/*System.out.println(beregn(12, 13, "summer"));
		System.out.println(beregn(-5, 3, "stoerst"));
		System.out.println(beregn(54, 45, "differanse"));*/
		
		int summer = beregn( 12, 13, (a,b) -> a + b);
		System.out.println(summer);
		
		int stoerst = beregn(-5, 3, (a, b) -> Math.max(a, b));
		System.out.println(stoerst);
		
		int differanse = beregn(54, 45, (a, b) -> Math.abs(a - b));
		System.out.println(differanse);
		
		
	}

}