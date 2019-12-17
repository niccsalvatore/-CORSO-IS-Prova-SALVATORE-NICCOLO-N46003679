package esame.entity;

import java.util.ArrayList;

public class Appello {
		private int numDate;
		private Corso corso;
		private String id_appello;
		private ArrayList<Data> date = new ArrayList<Data>();
		private ArrayList<Appello> elencoAppelli=new ArrayList<Appello>();
		public ArrayList<Studente> studentiPrenotati = new ArrayList<Studente>();

 public Appello(int numDate,Corso corso, String id_appello) {
	 elencoAppelli=new ArrayList<Appello>();
	 date=new ArrayList<Data>();
	 this.numDate=numDate;
	 this.corso=corso;
	 this.id_appello=id_appello;
  	}

public Corso getCorso(){
	return corso;
		}

public void setCorso(Corso corso){
	this.corso=corso;
}

public int getNumDate() {
		return numDate;
}
public void setNumDate(int numDate) {
		this.numDate = numDate;
}

public void addData(Data d) {
		date.add(d);
}
 public void addAppello(Appello a) {
		elencoAppelli.add(a);
} 

public ArrayList<Data> getDate() {
		return date; 
}

public ArrayList<Studente> getStudentiPrenotati(){
	return studentiPrenotati;
	}

public String getId_appello() {
	return id_appello;
}

public void setId_appello(String id_appello) {
	this.id_appello = id_appello;
}

public String toString() {
 
 StringBuffer buf = new StringBuffer();
 
 buf.append("APPELLO DI "+corso+"\nID APPELLO: "+id_appello+"\nNUMERO DATE: "+numDate+ "\n");
 
 for(Data d : date) {
  buf.append("  DATA: "+d.getDataProva()+"\n  TIPO PROVA: "+d.getTipo()+"\n LUOGO PROVA:"+d.getTipoa()+"\n");
 } 
 
 return buf.toString();
}

@Override
public boolean equals(Object obj){
	Appello a= (Appello)obj;
	if(this.id_appello==(a.getId_appello())){
			return true;
	}
	return false;
}


}
