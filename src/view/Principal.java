package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.random() * 101;
		}
		for (int i = 1; i < 3; i++) {
			Thread inicializar = new ThreadVetor(i, vetor);
			inicializar.start();
		}
	}
}
