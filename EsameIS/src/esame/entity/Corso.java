package esame.entity;

import java.util.ArrayList;

public class Corso {
	
	private String nomeCorso;
	private String docenteCorso;
	private int CFU;
	private ArrayList<Corso> listaCorsi = new ArrayList<Corso>();

	public Corso(String nomeCorso, String docenteCorso, int CFU) {
		this.nomeCorso = nomeCorso;
		this.setDocenteCorso(docenteCorso);
		this.CFU = CFU;
	}
	
	public void crealistaCorsi(Corso nomeCorso){
		listaCorsi.add(nomeCorso);
	}
	
	public int getCFU() {
		return CFU;
	}

	public void setCFU(int CFU) {
		this.CFU = CFU;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNome(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public String getDocenteCorso() {
		return docenteCorso;
	}

	public void setDocenteCorso(String docenteCorso) {
		this.docenteCorso = docenteCorso;
	}

	public String toString(){
		StringBuffer buf = new StringBuffer();
		
		buf.append("CORSO: "+nomeCorso+" DOCENTE: "+docenteCorso+" CFU:"+CFU+"\n");
		return buf.toString();
	}
}
