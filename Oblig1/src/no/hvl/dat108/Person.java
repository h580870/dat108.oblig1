package no.hvl.dat108;

public class Person {
	private StringBuffer namn;
	
	public Person(StringBuffer namn) {
		this.namn = namn; //hei......
		
	}

	public StringBuffer getNamn() {
		return namn;
	}

	public void setNamn(StringBuffer namn) {
		this.namn = namn;
	}

	@Override
	public String toString() {
		return "Person [namn=" + namn + "]";
	}
	
	
	
}
