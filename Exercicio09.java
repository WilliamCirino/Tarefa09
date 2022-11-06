package tarefa09;

import java.util.Scanner;

/* 9) Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final devem ser 
apresentados o maior e o menor valores informados pelo usuário.*/

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maior = 0, menor = 10000000, numero1 = 0;

		while (numero1 >= 0) {
			System.out.println("Insira o valor");
			numero1 = sc.nextInt();

			if (numero1 > maior)
				maior = numero1;

			if (numero1 < menor && numero1 >= 0)
				menor = numero1;
		}

		System.out.println(menor);
		System.out.println(maior);
		sc.close();
	}
}