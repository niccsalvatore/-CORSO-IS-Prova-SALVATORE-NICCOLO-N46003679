package esame.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import esame.control.ControlUniversità;
import esame.entity.*;

import java.util.ArrayList;

public class TestControlUniversità {

		ControlUniversità CU= new ControlUniversità();
		public ArrayList<Studente> studentiPrenotati=new ArrayList<Studente>(); 
		@Before
		public void setUp() {
			
		}
		@Test
		public void test01UnoStudenteUnCorsoUnAppelloUnaDataUnaPrenotazione() {
			Corso corso1=CU.creaCorso("Ingegneria del Software", "Roberto Natella", 9);
			Data data1= new Data("19 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			Appello appello =new Appello(1,corso1,"CX2");
			appello.addData(data1);
			CU.aggiungiAppello(appello);
			Studente s= new Studente("Niccolò","Salvatore","N46003679",60910);
			CU.effettuaPrenotazione(appello,s);
			CU.visualizzaStudentiPrenotati(appello);
			assertEquals(1,appello.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 1\n");
		}
		@Test
		public void test02UnoStudenteUnCorsoUnAppelloUnaDataPiùPrenotazioni() {
			Corso corso1=CU.creaCorso("Ingegneria del Software", "Roberto Natella",9);
			Data data1= new Data("19 settembre",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			Appello appello =new Appello(1,corso1,"CX2");
			appello.addData(data1);
			CU.aggiungiAppello(appello);
			Studente s= new Studente("Niccolò","Salvatore","N46003679",60910);
			CU.effettuaPrenotazione(appello,s);
			CU.effettuaPrenotazione(appello,s);
			CU.visualizzaStudentiPrenotati(appello);
			assertEquals(1,appello.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 2\n");
		}
		@Test
		public void test03PiùStudenteUnCorsoUnAppelloZeroDatePiùPrenotazioni() {
			Corso corso1=CU.creaCorso("Ingegneria del Software", "Roberto Natella",9);
			Appello appello =new Appello(0,corso1,"CX2");
			CU.aggiungiAppello(appello);
			Studente s= new Studente("Niccolò","Salvatore","N46003679",60910);
			Studente k= new Studente("Mario","Rossi","N46003567",25485);
			CU.effettuaPrenotazione(appello,s);
			CU.effettuaPrenotazione(appello,k);
			CU.visualizzaStudentiPrenotati(appello);
			assertEquals(0,appello.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 3\n");
		}
		@Test
		public void test04PiùStudenteUnCorsoPiùAppelliPiùDatePiùPrenotazioni() {
			Corso corso1=CU.creaCorso("Ingegneria del Software", "Roberto Natella",9);
			Appello appello =new Appello(3,corso1,"CX2");
			Data data1= new Data("19 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			appello.addData(data1);
			Data data2= new Data("20 settembre 2019",tipoProva.SCRITTO, luogoProva.AULA);
			appello.addData(data2);
			CU.aggiungiAppello(appello);
			Appello appello2= new Appello(1,corso1,"CX3");
			Data data3= new Data("21 settembre 2019",tipoProva.ORALE, luogoProva.AULA);
			appello2.addData(data3);
			CU.aggiungiAppello(appello2);
			Studente s= new Studente("Niccolò","Salvatore","N46003679",60910);
			Studente k= new Studente("Mario","Rossi","N46003567",25485);
			CU.effettuaPrenotazione(appello,s);
			CU.effettuaPrenotazione(appello,k);
			CU.effettuaPrenotazione(appello2,k);
			CU.visualizzaStudentiPrenotati(appello);
			CU.visualizzaStudentiPrenotati(appello2);
			assertEquals(2,appello.studentiPrenotati.size());
			assertEquals(1,appello2.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 4\n");;
		}
		@Test
		public void test05UnoStudentePiùCorsiUnAppelloPiùDateUnaPrenotazione() {
			Corso corso1=CU.creaCorso("Ingegneria del Software", "Roberto Natella",9);
			Corso corso2=CU.creaCorso("Elettronica" , "Maresca",9);
			Appello appello =new Appello(2,corso1,"CX2");
			Data data1= new Data("19 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			appello.addData(data1);
			Data data2= new Data("20 settembre 2019",tipoProva.SCRITTO, luogoProva.AULA);
			appello.addData(data2);
			CU.aggiungiAppello(appello);
			Appello appello2= new Appello(2,corso2,"CX3");
			Data data3= new Data("9 settembre 2019",tipoProva.SCRITTO, luogoProva.AULA);
			Data data4= new Data("10 settembre 2019",tipoProva.ORALE, luogoProva.AULA);
			appello2.addData(data3);
			appello2.addData(data4);
			CU.aggiungiAppello(appello2);
			Studente s= new Studente("Niccolò","Salvatore","N46003679",60910);
			CU.effettuaPrenotazione(appello,s);
			CU.effettuaPrenotazione(appello2,s);
			CU.visualizzaStudentiPrenotati(appello);
			CU.visualizzaStudentiPrenotati(appello2);
			assertEquals(1,appello.studentiPrenotati.size());
			assertEquals(1,appello2.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 5\n");
		}

		@Test
		public void test06ZeroStudentiUnCorsoUnAppelloPiùDateZeroPrenotazioni() {
			Corso corso1=CU.creaCorso("Ingegneria del Software", "Roberto Natella",9);
			Data data1= new Data("19 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			Appello appello =new Appello(1,corso1,"CX2");
			appello.addData(data1);
			CU.aggiungiAppello(appello);
			CU.visualizzaStudentiPrenotati(appello);
			assertEquals(0,appello.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 6\n");
		}
		@Test
		public void test07ZeroDocenti() {
			Corso corso1=CU.creaCorso("Ingegneria del Software",null,9);
			Data data1= new Data("19 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			Appello appello =new Appello(1,corso1,"CX2");
			appello.addData(data1);
			CU.aggiungiAppello(appello);
			Studente s= new Studente("Niccolò","Salvatore","N46003679",60910);
			CU.effettuaPrenotazione(appello,s);
			CU.visualizzaStudentiPrenotati(appello);
			assertEquals(0,appello.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 7\n");
		}
		@Test
		public void test08PiùStudentiPiùCorsiUnDocentePiùAppelliPiùDateUnaPrenotazione() {
			Corso corso1=CU.creaCorso("Ingegneria del Software", "Roberto Natella", 9 );
			Corso corso2=CU.creaCorso("Sistemi operativi", "Roberto Natella", 9);
			Appello appello =new Appello(2,corso1,"CX2");
			Data data1= new Data("19 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			appello.addData(data1);
			Data data2= new Data("12 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			appello.addData(data2);
			CU.aggiungiAppello(appello);
			Appello appello2= new Appello(2,corso2,"CX3");
			Data data3= new Data("6 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			Data data4= new Data("15 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
			appello2.addData(data3);
			appello2.addData(data4);
			CU.aggiungiAppello(appello2);
			Studente s= new Studente("Niccolò","Salvatore","N46003679",60910);
			Studente k= new Studente("Mario","Rossi","N46003456",64365);
			CU.effettuaPrenotazione(appello,s);
			CU.effettuaPrenotazione(appello2,s);
			CU.effettuaPrenotazione(appello2,k);
			CU.visualizzaStudentiPrenotati(appello);
			CU.visualizzaStudentiPrenotati(appello2);
			assertEquals(1,appello.studentiPrenotati.size());
			assertEquals(2,appello2.studentiPrenotati.size());
			System.out.println(" SOPRA E' TEST 8\n");
		}
		
		@Test
		 public void test09ZeroCorsi() {
		  Corso corso1=CU.creaCorso(null,"Roberto Natella",9);
		  Data data1= new Data("15 settembre 2019",tipoProva.CALCOLATORE, luogoProva.LABORATORIO);
		  Appello a =new Appello(1,corso1,"CX2");
		  CU.aggiungiAppello(a);
		  a.addData(data1);
		  Studente s= new Studente("Luigi","Garofalo","N46003756",21785);
		  CU.effettuaPrenotazione(a,s);
		  CU.visualizzaStudentiPrenotati(a);
		  assertEquals(0,a.studentiPrenotati.size());
		  System.out.println(" SOPRA E' TEST 9");
		 }
	}