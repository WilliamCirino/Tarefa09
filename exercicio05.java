package tarefa09;

/* 5) Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente ototal do somatório da fatorial de cada 
valor lido.*/
public class exercicio05 {

	public static void main(String[] args) {
		int num = 0, soma = 0, fatorial = 0;

		while (num < 16) {
			fatorial = num * (num - 1);
			soma = fatorial + soma;
			num += 1;
		}

		System.out.println(soma);
	}
}