package DesafioControleFluxo;

public class Contador {

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 1; i <= contagem; i++ ) {
			System.out.println("Imprimindo o numero: " + i);
		}
	}
}
