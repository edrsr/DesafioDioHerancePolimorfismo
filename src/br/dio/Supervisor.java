package br.dio;

public class Supervisor extends Funcionario{

	public double calculaImposto() {
		return this.getImposto() * 0.05;
	}
}