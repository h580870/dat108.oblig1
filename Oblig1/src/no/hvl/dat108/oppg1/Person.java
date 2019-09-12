package no.hvl.dat108.oppg1;

public class Person {
	private StringBuffer namn;
	
	public Person(StringBuffer namn) {
		this.namn = namn;
		
	}

	public StringBuffer getNamn() {
		return namn;
	}

	public void setNamn(StringBuffer namn) {
		this.namn.delete(0,this.namn.length());
		this.namn.append(namn);
	}

	@Override
	public String toString() {
		return "Person [namn=" + namn + "]";
	}
	
	
	
}
