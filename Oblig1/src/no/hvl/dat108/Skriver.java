package no.hvl.dat108;

public class Skriver implements Runnable {
	
	private Person person;
	private StringBuffer name;
	
	public Skriver (Person person, StringBuffer namn) {
		this.person = person;
		this.name = namn;
	}
	
	public void run() {
		this.person.setNamn(name);
	}
	
}
