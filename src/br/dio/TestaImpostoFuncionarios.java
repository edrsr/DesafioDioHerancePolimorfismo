package br.dio;

public class TestaImpostoFuncionarios {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setImposto(100);
		
		Atendente a1 = new Atendente();
		a1.setImposto(100);
		
		Supervisor s1 = new Supervisor();
		s1.setImposto(100);
		
		Gerente g1 = new Gerente();
		g1.setImposto(100);
		
		System.out.println("Imprimindo valor padrão do imposto sem funcionário associado: "+f1.calculaImposto());
		System.out.println("Imprimindo valor do imposto do Atendente: "+a1.calculaImposto());
		System.out.println("Imprimindo valor do imposto do Supervisor: "+s1.calculaImposto());
		System.out.println("Imprimindo valor do imposto do Gerente: "+g1.calculaImposto());
		
	
	}

}