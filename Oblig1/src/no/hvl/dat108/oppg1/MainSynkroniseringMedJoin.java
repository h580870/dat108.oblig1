package no.hvl.dat108.oppg1;

public class MainSynkroniseringMedJoin {

	public static void main(String[] args) {
		
		//Her laga ej ETT person objekt.. og dinna!! den skal vi endre på fem gonga.
		Person p = new Person(new StringBuffer("Kaarejon"));
		
		//So begynne man å endre på den.
		Skriver sk1 = new Skriver(p, new StringBuffer("Potulusu"));
		Skriver sk2 = new Skriver(p, new StringBuffer("Bamename"));
		Skriver sk3 = new Skriver(p, new StringBuffer("Kalijulu"));
		Skriver sk4 = new Skriver(p, new StringBuffer("Opandait"));
		Skriver sk5 = new Skriver(p, new StringBuffer("Preventu"));
		Leser le1 = new Leser(p);
		Leser le2 = new Leser(p);
		Leser le3 = new Leser(p);
		Leser le4 = new Leser(p);
		Leser le5 = new Leser(p);
		
		Thread t1 = new Thread(sk1);
		Thread t2 = new Thread(sk2);
		Thread t3 = new Thread(sk3);
		Thread t4 = new Thread(sk4);
		Thread t5 = new Thread(sk5);
		Thread t6 = new Thread(le1);
		Thread t7 = new Thread(le2);
		Thread t8 = new Thread(le3);
		Thread t9 = new Thread(le4);
		Thread t10 = new Thread(le5);
		try {
		t1.start();
		t1.join();
		t6.start();
		t6.join();
		t2.start();
		t2.join();
		t7.start();
		t7.join();
		t3.start();
		t3.join();
		t8.start();
		t8.join();
		t4.start();
		t4.join();
		t9.start();
		t9.join();
		t5.start();
		t5.join();
		t10.start();
		t10.join();
		} catch (Exception e) {
			
		}
		
	}

}
