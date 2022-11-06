package tarefa09;
//2) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
public class Exercicio02 {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 500; contador++) {
			if (contador % 2 == 0) {
				System.out.println(contador+contador);
			}
		}

	}

}
