package Estruturas;

public class ListaSeq {
	private int dados[];
	private int tamAtual;
	private int tamMax;

	public ListaSeq() {
		this.tamAtual = 0;
		this.tamMax = 100;
		this.dados = new int [tamMax];
	}

	public boolean vazia() {
		if (tamAtual == 0)
			return true;
		else return false;
	}

	public boolean cheia() {
		if (tamMax == tamAtual)
			return true;
		else return false;
	}

	public int tamanho () {
		return tamAtual;
	}

	public int elemento (int pos) {
		if (pos > tamAtual || pos <=0)
			return -1;
		int dado = dados[pos-1];
		return dado;
	}

	public int posicao (int dado) {
		for (int i =0; i < tamAtual; i++) {
			if (dados[i] == dado) {
				return (i + 1);
			}
		}
		return - 1;	
	}

	public int insere (int pos, int dado) {
		if (cheia() || pos > tamAtual + 1 || pos <= 0) {
			return -1;
		}
		for (int i = tamAtual; i >= pos; i--) {	
			dados[i] = dados [i-1];
		}
		dados[pos-1] = dado;
		tamAtual++;
		return dado;	
	}

	public int remove (int pos) { // problema para remover 
		int dado;
		if((pos > tamAtual || (pos < 1)))
			return -1;
		
		for(int i = pos -1 ; i < tamAtual; i++) {
			dados[i] = dados [i+1];	
			dados[tamAtual] = 0;
		}
		dado = dados[pos-1];
		tamAtual -- ;
		return dado;		
	}


}


