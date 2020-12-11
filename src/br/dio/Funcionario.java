
package br.dio;

public class Funcionario {
		
		private int matricula;
		private String nome;
		private double imposto;
		
		
		public double calculaImposto() {
		return this.imposto * 0.0;
		}
		
		public int getMatricula() {
		return matricula;
		}
		
		public void setMatricula(int matricula) {
		this.matricula = matricula;
		}
		
		public String getNome() {
		return nome;
		}
		
		public void setNome(String nome) {
		this.nome = nome;
		}
		
		public double getImposto() {
		return imposto;
		}
		
		public void setImposto(double imposto) {
		this.imposto = imposto;
		}

}