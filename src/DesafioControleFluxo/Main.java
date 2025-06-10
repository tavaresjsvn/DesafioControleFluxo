package DesafioControleFluxo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número do parâmetro um: ");
		int parametroUm = input.nextInt();
		System.out.println("Digite o número do parãmetro dois: ");
		int parametroDois = input.nextInt();
		
		Contador contador = new Contador();
		
		try {
			contador.contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Ocorreu um erro: " + exception.getMessage());
		}
		
		input.close();
	}

}
