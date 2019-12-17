package esame.entity;

public class Data {
	 

	 private String dataProva;
	 private tipoProva tipo;
	 private luogoProva tipoa;
	 
	 public Data(String dataProva, tipoProva tipo, luogoProva tipoa) {
	  
	  this.dataProva=dataProva;
	  this.tipo = tipo;
	  this.tipoa = tipoa;
	 }



	public String getDataProva() {
	  return dataProva;
	 }
	 public void setDataProva(String dataProva) {
	  this.dataProva = dataProva;
	 }


	public tipoProva getTipo() {
		return tipo;
	}


	public void setTipo(tipoProva tipo) {
		this.tipo = tipo;
	}


	public luogoProva getTipoa() {
		return tipoa;
	}


	public void setTipoa(luogoProva tipoa) {
		this.tipoa = tipoa;
	}
}