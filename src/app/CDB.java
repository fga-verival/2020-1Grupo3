package app;
import java.lang.Math;
import java.text.DecimalFormat;

public class CDB {
	public float redimentoBruto(int dias, float aplicacaoInicial, float txAnual) {
		float tx = txAnual/100f;
		float ano = dias/365f;
		
		float valorFinal = (float) (aplicacaoInicial * (1 + tx * ano));
		
		float total = valorFinal - aplicacaoInicial;
		
		total = (int) (total*100f);
		total = total/100f;
		
		System.out.println(total);
		return total;
	}
}
