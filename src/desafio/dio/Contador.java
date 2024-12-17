package desafio.dio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int n1 = in.nextInt();
		
		System.out.println("Digite o segundo número:");
		int n2 = in.nextInt();
		
		try {
			contar(n1, n2);
		} catch(ParametrosInvalidosException e) {
			System.err.println("Erro! O segundo parâmetro deve ser maior do que o primeiro!");
		}
	}
	
	static void contar(int n1, int n2) throws ParametrosInvalidosException {
		if(n1 > n2) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = n2 - n1;
			for(int i = 1; i <= contagem; i++) {
				System.out.println(i);
			}
		}
	}
}
