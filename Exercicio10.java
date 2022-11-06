package tarefa09;

import java.util.Scanner;

/* 10) Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer. Para a elaboração do programa, não utilizar 
em hipótese alguma o conceito do operador aritmético DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve 
apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.*/

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dividendo, divisor, num = 0;

		System.out.println("Digite o dividendo");
		dividendo = sc.nextInt();

		System.out.println("Divige o divisor");
		divisor = sc.nextInt();

		while (dividendo > divisor)

		{
			num = num + 1;
			dividendo = dividendo - divisor;
		}

		System.out.println("O resultado é: " + num);
		sc.close();
	}
}
