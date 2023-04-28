package controller;
import br.edu.fateczl.lista.listaint.Lista;
import br.edu.fateczl.pilhaint.Pilha;

public class InverteLista {
	
	public InverteLista() {
		super();
	}
	
	public void Inverte(int[] vetor) throws Exception {
		Pilha p = new Pilha();
		Lista l = new Lista();

		for(int i: vetor) {
			if(!p.isEmpty()) {
				p.push(i);
			}else {
				p.push(i);
			}
		}
		
		int first = p.pop();
		l.addFirst(first);
		while(!p.isEmpty()) {
			int valor = p.pop();
			l.addLast(valor);
		}
		
		int tamanho = l.size();
		for(int i=0; i<= tamanho-1; i++ ) {
			System.out.print(l.get(i)+ " ");
		}
	}

}
