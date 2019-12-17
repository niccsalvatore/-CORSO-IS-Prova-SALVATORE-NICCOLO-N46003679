package esame.entity;

import java.util.ArrayList;

public class Studente {
private String nomeS;
private String cognomeS;
private String matricola;
private int PIN;
public ArrayList<Appello> appelliPrenotati = new ArrayList<Appello>();


	public Studente(String nomeS, String cognomeS, String matricola, int PIN) {
		appelliPrenotati = new ArrayList<Appello>();
		this.setNomeS(nomeS);
		this.setCognomeS(cognomeS);
		this.setPIN(PIN);
		this.setMatricola(matricola);
	}

	public String getNomeS() {
		return nomeS;
	}

	public void setNomeS(String nomeS) {
		this.nomeS = nomeS;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getCognomeS() {
		return cognomeS;
	}

	public void setCognomeS(String cognomeS) {
		this.cognomeS = cognomeS;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}
	
	
	public String toString(){
		
		StringBuffer buf = new StringBuffer();
		
		buf.append("STUDENTE: "+nomeS+" "+cognomeS+" MATRICOLA: "+matricola+"\n");
		return buf.toString();
	}
}
