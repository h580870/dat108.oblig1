package Hassan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Oppgave2 {

	public static void main(String[] args) {
		
		//a
		List <String> listen = Arrays.asList("10","1","20","110","21","12");
		Collections.sort(listen,(s1,s2) ->Integer.valueOf(s1).compareTo(Integer.valueOf(s2)));
		
		System.out.println(listen);
		
		// b
		
		Beregn beregn = new Beregn();
		String res1 = Beregn.kal((a,b) -> "" +(a+b),12, 13);
		String res2 = Beregn.kal((a,b) -> "" +Math.max(a, b),-5, 3);
		String res3 = Beregn.kal((a,b) -> "" +Math.abs(a-b), 54, 45);
		
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        
		
		
		
		
		
		

	}
	
}
	
	class Beregn{
		public static  String kal(BiFunction <Integer, Integer, String> bi, Integer i1, Integer i2) {
			
			return bi.apply(i1, i2);
			
		}
	}
	
	
	


