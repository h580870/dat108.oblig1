package no.hvl.dat108.oppg1;

public class Leser implements Runnable {
	
	private Person p;
	
	public Leser(Person p) {
		this.p = p;
	}
	
	public void run () {
		System.out.println(p.getNamn());
	}
	
}
