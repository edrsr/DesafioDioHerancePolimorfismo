package br.dio;

public class Atendente extends Funcionario{
	
		public double calculaImposto() {
			return this.getImposto() * 0.01;
		}

}
