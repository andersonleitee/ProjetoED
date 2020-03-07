package Estruturas;

public class ListaEncad {
	private No cabeca;
	int tamanho;

	ListaEncad(){
		cabeca = null;
		tamanho = 0;
	}

	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}
		else return false;
	}

	public int tamanho() {
		return tamanho;
	}

	public int elemento (int pos) {
		No aux = cabeca;
		int cont = 1;

		if (vazia()) return -1;

		if ((pos < 1) || (pos > tamanho)) return -1;
		while (cont < pos) {
			aux = aux.getProx();
			cont++;
		}

		return aux.getValor(); 
	}

	public int posicao (int dado) {
		int cont = 1;
		No aux;

		if (vazia()) return 0;
		aux = cabeca;
		while (aux != null) {
			if(aux.getValor() == dado)
				return cont;
			aux = aux.getProx();
			cont++;
		}
		return -1;
	}

	public boolean insere (int pos, int dado) {
		if ((vazia()) && (pos !=1)) return false;
		if ((pos ==1)) {
			return insereInicioLista(dado);
		}
		if  (pos > tamanho) { // posição maior que o tamanho sempre sera posto no fim.
			return insereFimLista(dado);
		} else {
			return insereMeioLista(pos, dado);
		}
	}

	private boolean insereInicioLista(int valor) {

		No novoNo = new No();

		novoNo.setValor(valor);
		novoNo.setProx(cabeca);
		cabeca = novoNo;
		tamanho++;
		return true;
	}

	private boolean insereMeioLista (int pos, int dado) {
		int cont = 1;
		No novoNo = new No ();
		novoNo.setValor(dado);

		No aux = cabeca;
		while((cont < pos -1) && (aux != null)) {
			aux = aux.getProx();
			cont++;
		}
		if (aux == null) return false;
		novoNo.setProx(aux.getProx());
		aux.setProx(novoNo);
		tamanho++;
		return true;		
	}

	private boolean insereFimLista(int dado) {
		No novoNo = new No();
		novoNo.setValor(dado);

		No aux = cabeca;
		while (aux.getProx() != null) {
			aux = aux.getProx();
		}
		novoNo.setProx(null);
		aux.setProx(novoNo);
		this.tamanho ++;
		return true;
	}

	public int remove (int pos) {
		if (vazia()) return -1;
		if (pos == 1) {
			return removeInicioLista();
		}
		else {
			return removeNaLista(pos);
		}
	}

	private int removeInicioLista() {
		No p = cabeca;
		int dado = p.getValor();

		cabeca = p.getProx();
		tamanho --;
		p = null;

		return dado;
	}

	private int removeNaLista(int pos) {
		No atual = null, antecessor = null;
		int dado = -1, cont = -1;

		atual = cabeca;
		while ((cont < pos) && (atual != null)) {
			antecessor = atual;
			atual = atual.getProx();
			cont++;
		}
		if (atual == null)
			return -1;
		dado = atual.getValor();
		antecessor.setProx(atual.getProx());
		tamanho--;

		atual = null;
		return dado;
	}

}
