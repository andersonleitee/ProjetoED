package Estruturas;

public class Fila {
	private int[] elementos;
	private int primeiro;
	private int tamanho;

	public Fila() {
		int capacidade = 11;
		elementos = new int[capacidade];
		primeiro = 0;
		tamanho = 0;

	}
	
	public int tamanho() {
		return tamanho;
	}

	public boolean adcionar(int elemento) {
		if (estaCheia()){
			throw new RuntimeException("Fila cheia,não é possível armazenar mais elementos");

		}
		if(this.tamanho<this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}



	public int remover() {
		if(estaVazia()) {
			throw new RuntimeException("Fila vazia, adcione elementos");
		}
		int elementoRemover = this.elementos[primeiro];
		for(int i =primeiro; i<tamanho-1; i++) {
			elementos[i]= elementos[i+1];
		}
		tamanho--;

		return elementoRemover;

	}

	public boolean estaVazia() {
		return tamanho==0;
	}

	public boolean estaCheia() {
		return tamanho==elementos.length;

	}
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}

}
