package controller;

public class operaçoesControle {

	public operaçoesControle () {
		super();
	}
	
	//Concatena 1000  caracteres , 1 a 1, em uma var. String 
	public void concatenaString() {
		String cadeia = " ";
		double tempoInicial = System.nanoTime();
		for (int i = 0; i <  100000; i++) {
			cadeia = cadeia + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal = tempoTotal / Math.pow(10,9);
		System.out.println("String==> "+tempoTotal+"S.");
	}
	//Concatena Buffer
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0; i <  100000; i++) {
			buffer.append("a");	
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,9);
		System.out.println("Buffer==> "+tempoTotal+"S.");
	}
	
	//Vetor 
	public void divideFrase(String frase){
		String[] vetorPalavras = frase.split(" ");
		// Foreach
		for (String palavra : vetorPalavras) {
			System.out.println(palavra);
		}
		
	}
}
