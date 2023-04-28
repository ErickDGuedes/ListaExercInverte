package view;

import controller.InverteLista;

public class Principal {

	public static void main(String[] args) throws Exception {
		InverteLista inv = new InverteLista();
		int[] vetor = {3,5,18,12,9,7,6,2,13,4,16};
		
		inv.Inverte(vetor);
	
	}

}
