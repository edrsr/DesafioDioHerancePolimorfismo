package br.dio;

public class Gerente extends Funcionario{

	public double calculaImposto() {
		return this.getImposto() * 0.1;
	}
}