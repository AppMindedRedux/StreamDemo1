package be.intecbrussel.StreamArray;

public class Person {
	
	private String voornaam;
	private String achternaam;
	private Enum<Geslacht> geslacht;
	private int leeftijd;
	private float gewicht;
	private float lengte;
	
	
	public Person(String voornaam, String achternaam, Enum<Geslacht> geslacht, int leeftijd, float gewicht,
			float lengte) {
		super();
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.geslacht = geslacht;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
	}


	public String getVoornaam() {
		return voornaam;
	}


	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}


	public String getAchternaam() {
		return achternaam;
	}


	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}


	public Enum<Geslacht> getGeslacht() {
		return geslacht;
	}


	public void setGeslacht(Enum<Geslacht> geslacht) {
		this.geslacht = geslacht;
	}


	public int getLeeftijd() {
		return leeftijd;
	}


	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}


	public float getGewicht() {
		return gewicht;
	}


	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}


	public float getLengte() {
		return lengte;
	}


	public void setLengte(float lengte) {
		this.lengte = lengte;
	}


	@Override
	public String toString() {
		return "Person [voornaam=" + voornaam + ", achternaam=" + achternaam + ", geslacht=" + geslacht + ", leeftijd="
				+ leeftijd + ", gewicht=" + gewicht + ", lengte=" + lengte + "]";
	}
	
	
	
}
