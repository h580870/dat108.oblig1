package no.hvl.dat108;

public class MainSynkroniseringMedSleep {

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
		Thread.sleep(100);
		t6.start();
		Thread.sleep(100);
		t2.start();
		Thread.sleep(100);
		t7.start();
		Thread.sleep(100);
		t3.start();
		Thread.sleep(100);
		t8.start();
		Thread.sleep(100);
		t4.start();
		Thread.sleep(100);
		t9.start();
		Thread.sleep(100);
		t5.start();
		Thread.sleep(100);
		t10.start();
		} catch (Exception e) {
			
		}
		
	}

}
