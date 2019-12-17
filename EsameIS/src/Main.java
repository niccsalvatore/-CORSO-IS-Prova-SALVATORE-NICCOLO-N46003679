
import esame.control.*;
import esame.entity.*;


public class Main {
	
	public static void main (String[] args) {
		ControlUniversità cu = new ControlUniversità();
		Corso c1 = cu.creaCorso("Ingegneria del Software", "Roberto Natella", 9);
		cu.visualizzaCorsi();
		System.out.println("\n");
		Appello a = new Appello(3, c1, "CX2");
		cu.aggiungiAppello(a);
		Data data1 = new Data("10 settembre 2019", tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
		Data data2 = new Data("11 settembre 2019", tipoProva.SCRITTO, luogoProva.AULA);
		Data data3 = new Data("15 settembre 2019", tipoProva.ORALE, luogoProva.AULA);
		a.addData(data1);
		a.addData(data2);
		a.addData(data3);
		Studente s1 = new Studente("Niccolò", "Salvatore", "N46003679", 60910);
		Studente s2 = new Studente("Mario", "Rossi", "N46003675", 71543);
		cu.effettuaPrenotazione(a, s1);
		cu.effettuaPrenotazione(a, s2);
		cu.visualizzaStudentiPrenotati(a);
	}
	
}
