package Hassan;

public enum Kjonn {
	Kvinne(1), Mann(2);
	private int nr;
	
	private Kjonn (int nr) {
		this.setNr(nr);
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

}
