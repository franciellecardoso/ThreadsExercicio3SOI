package controller;

public class ThreadVetor extends Thread {

	private int[] vetor;
	private int i;

	public ThreadVetor(int i, int[] vetor) {
		this.vetor = vetor;
		this.i = i;
	}

	@Override
	public void run() {
		tempo();
	}

	private void tempo() {
		if (i % 2 == 0) {
			double tInicial = System.nanoTime();
			for (int j = 0; j < vetor.length; j++) {
			}
			double tFinal = System.nanoTime();
			double tTotal = tFinal - tInicial;
			tTotal = tTotal / Math.pow(10, 9);
			System.out.println("Par = " + tTotal + " s");
		} else {
			double tInicial = System.nanoTime();
			// forEach
			for (int j : vetor) {
			}
			double tFinal = System.nanoTime();
			double tTotal = tFinal - tInicial;
			tTotal = tTotal / Math.pow(10, 9);
			System.out.println("Ímpar = " + tTotal + " s");
		}
	}
}
