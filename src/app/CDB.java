package app;


public class CDB {
	private int  qtDias;
	private float rendBruto;
	
	

	public float redimentoBruto(int dias, float aplicacaoInicial, float txAnual) {
		float tx = txAnual/100f;
		float ano = dias/365f;
		
		float valorFinal = (float) (aplicacaoInicial * (1 + tx * ano));
		
		float total = valorFinal - aplicacaoInicial;
		
		total = (int) (total*100f);
		total = total/100f;
		
		this.rendBruto = total;
		this.qtDias = dias;

		return total;
	}

	public float getImposto() {
		float aliquota = 0;
		
		if(this.qtDias<=180) {
			aliquota = 22.5f;		
		}
		
		else if(this.qtDias>180 && this.qtDias<=360) {
			aliquota= 20f;
		}
		
		else if(this.qtDias>360 && this.qtDias<=720) {
			aliquota = 17.5f;
		}
		else  {
			aliquota = 15f;
		}
		
		return (this.rendBruto * aliquota) / 100;


		
	}
	
	
	 
}
