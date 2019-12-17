package esame.control;

import java.util.ArrayList;
import esame.entity.*;

public class ControlUniversità {

	private ArrayList<Corso> listaCorsi = new ArrayList<Corso>();
	private ArrayList<Appello> elencoAppelli = new ArrayList<Appello>();
	
	// CREA CORSO
	 public Corso creaCorso(String nomeCorso, String docenteCorso, int CFU) {	
		 Corso nome = new Corso(nomeCorso, docenteCorso, CFU);
		 if(nome.getDocenteCorso() == null || nome.getNomeCorso() == null){
			 System.out.println("NON ESISTONO APPELLI");
			 return null;
		 }
		 else{
		listaCorsi.add(nome);
		 }
		return nome;	
	}
	
	// VISUALIZZA CORSI
	public void visualizzaCorsi(){
		System.out.println("NOME CORSO - DOCENTE CORSO - CFU");
		for(Corso a: listaCorsi){
			System.out.println(a.getNomeCorso() + " - " + a.getDocenteCorso() + " - " + a.getCFU());
		}
	}
	
	
	// AGGIUNGERE APPELLO
	public void aggiungiAppello(Appello a){
		if(!cercaAppello(a))
			elencoAppelli.add(a);
	}
	
	// CERCA APPELLO
	public boolean cercaAppello(Appello codiceAppello){		
	boolean flag = false;
	if(elencoAppelli.size() == 0)	
	return flag = false;
	else
	{
		for(Appello a : elencoAppelli){
			if (a.equals(codiceAppello))
				return flag = true;
		}
	}
		return flag;
	}
	
	// VISUALIZZA APPELLI
	public void visualizzaAppelli(){
		for(Appello a: elencoAppelli){
			System.out.println(a.toString());
		}
	}
	
	// PRENOTAZIONE APPELLO
	 public void effettuaPrenotazione(Appello a,Studente s)
	 { 
		 if(a.getCorso() == null){
			 System.out.println("");
		 }
		 else if (cercaAppello(a)==true) {
		  if(a.getCorso() !=null){
		  
		  if(a.getCorso().getDocenteCorso()!=null){
			  if(a.getDate().size()!=0){
				  if(s.appelliPrenotati.contains(a))
					  return;
			  
				  else{
		  
		  s.appelliPrenotati.add(a);
		  a.studentiPrenotati.add(s);  
				  }
			  }
	 }
		  }
	 else {
		 return;
	 }
	  }
	  else{
		  System.out.println("ERRORE: IMPOSSIBILE EFFETTUARE LA PRENOTAZIONE");
	  }
	 }
	 
	 // VISUALIZZA STUDENTI PRENOTATI DETERMINATO APPELLO
	 public void visualizzaStudentiPrenotati(Appello a) {
		 if(a.getCorso() ==null){
	System.out.println(" ");
	 }
	 
	 else{
		  if(a.getStudentiPrenotati().size() == 0){
			  System.out.println("NON CI SONO STUDENTI PRENOTATI PER "+a);
		  }
		  else{
		  System.out.println("GLI STUDENTI PRENOTATI PER "+a+" SONO :\n");
		  for(Studente s : a.getStudentiPrenotati()) 
		   System.out.println(s);
		  	}
	 	}
	 }
}

	

