package app;

public class CDB {

	private int  qtDias;
	private float aplicacaoInicial;
	private float rendBruto;

	public float redimentoBruto(int dias, float aplicacaoInicial, float txAnual) {
		this.qtDias = dias;
		this.aplicacaoInicial = aplicacaoInicial;
		
		float tx = txAnual/100f;
		float ano = dias/365f;
		
		float valorFinal = (float) (aplicacaoInicial * (1 + tx * ano));
		
		float total = valorFinal - aplicacaoInicial;
		
		total = (int) (total*100f);
		total = total/100f;
		
		this.rendBruto = total;

		return total;
	}

	public float getImposto() {
		float aliquota = 0;
		
		if (this.qtDias<=180) {
			aliquota = 22.5f;		
		}
		
		else if (this.qtDias>180 && this.qtDias<=360) {
			aliquota= 20f;
		}
		
		else if (this.qtDias>360 && this.qtDias<=720) {
			aliquota = 17.5f;
		}
		else  {
			aliquota = 15f;
		}
		
		return (this.rendBruto * aliquota) / 100;
	}

	public float calcularRendimentoLiquido() {
		// return 9.945f; // falsificação
		
		float rendimentoBruto = this.rendBruto;
		
		float impostoRenda = this.getImposto();
		impostoRenda = (int) (impostoRenda*100f);
		impostoRenda = impostoRenda/100f;
		
		float capitalInicial = this.aplicacaoInicial;
		
		float resultadoFinal = rendimentoBruto - impostoRenda + capitalInicial;
		
		float aux = resultadoFinal / capitalInicial;
		float rendimentoLiquido = aux * 100f - 100;
		rendimentoLiquido = (int) (rendimentoLiquido*1000f);
		rendimentoLiquido = rendimentoLiquido/1000f;

		return rendimentoLiquido;
	}
}
