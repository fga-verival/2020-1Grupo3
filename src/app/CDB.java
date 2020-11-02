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

	
	
	
	
	 
}
