
public abstract class KeyCardSystem {
	
	private static int cards;
	private String fNavn;
	private String sNavn;
	
	private int PIN, kortNummer;
	
	private boolean sperret;
	
	public void Kort(String fName, String sName, int PIN){
		this.fNavn = fNavn;
		this.sNavn = sNavn;
		this.PIN = PIN;
		kortNummer = ++cards;
		
	}
	
	public abstract boolean sjekkPIN(int pin);
	
	
	
	public boolean isSperret(){
		return sperret;
	}
	
	public String getNavn() {
		return fNavn + " " + sNavn;
	}

	public boolean erSperret() {
		return sperret;
	}

	public void endreSperret() {
		sperret = !sperret;
	}

	public static int getKort() {
		return cards;
	}

	public String getForNavn() {
		return fNavn;
	}

	public void setForNavn(String forNavn) {
		this.fNavn = forNavn;
	}

	public String getEtterNavn() {
		return sNavn;
	}

	public void setEtterName(String etterNavn) {
		this.sNavn = etterNavn;
	}

	public int getPIN() {
		return PIN;
	}

	public int getKortNummer() {
		return kortNummer;
	}
	
	public static void setKort(int kortNummer) {
		cards = kortNummer;
	}

	public boolean getSperret() {
		return sperret;
	}

	public String toString() {
		return String.format(
				"Navn:\t\t%s\nPIN:\t\t%d\nKort nummer:\t%d\nEr sperret:\t%b\n",
				getNavn(), PIN, kortNummer, sperret);
	}
}
